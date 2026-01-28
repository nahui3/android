## Подробное использование библиотеки

### Что делает библиотека

Библиотека предоставляет простой Compose-компонент `FieldWithText`, который:

- **показывает текстовое поле ввода**;
- **отображает введённый текст** под полем.

Код компонента находится в пакете `com.nahui3.android.ui`:

- **файл**: `src/main/java/com/nahui3/android/ui/FieldWithText.kt`
- **Composable**: `FieldWithText`

Пример использования:

```kotlin
import com.nahui3.android.ui.FieldWithText

@Composable
fun SampleScreen() {
    FieldWithText()
}
```

Компонент использует Material 3 и Jetpack Compose.

---

### Варианты подключения библиотеки к Android-проекту

#### 1. Подключение как Git submodule + included build

1. **Добавьте репозиторий как сабмодуль** в корень вашего Android-проекта:

   ```bash
   git submodule add https://github.com/nahui3/android.git external/android-ui
   ```

2. **В `settings.gradle.kts` вашего основного проекта** добавьте:

   ```kotlin
   includeBuild("external/android-ui")
   ```

   Путь `external/android-ui` должен совпадать с фактическим путём до этого репозитория.

3. **В модуле приложения** (обычно `app/build.gradle.kts`) добавьте зависимость:

   ```kotlin
   dependencies {
       implementation(project(":nahui3-android-ui"))
   }
   ```

   Имя проекта `:nahui3-android-ui` берётся из `rootProject.name` в `settings.gradle.kts` этого репозитория.

4. Убедитесь, что в вашем проекте включён Compose и Material 3 (обычно уже есть в современных проектах).

#### 2. Подключение через JitPack (если вы будете публиковать репозиторий)

> Этот вариант потребует, чтобы вы опубликовали репозиторий на GitHub и использовали JitPack. Здесь приведён пример конфигурации; версию и groupId вы можете адаптировать под себя.

1. В `settings.gradle.kts` основного проекта добавьте репозиторий JitPack:

   ```kotlin
   dependencyResolutionManagement {
       repositories {
           google()
           mavenCentral()
           maven(url = "https://jitpack.io")
       }
   }
   ```

2. В модуле приложения добавьте зависимость (пример с JitPack):

   ```kotlin
   dependencies {
       implementation("com.github.nahui3:android:1.0.0")
   }
   ```

   Вместо `1.0.0` используйте нужный вам tag / release.

---

### Требования к окружению

- **Kotlin**: 2.0.21
- **Android Gradle Plugin**: 8.5.2
- **Compose BOM**: `androidx.compose:compose-bom:2024.10.01`
- **minSdk**: 24
- **compileSdk**: 35

Эти значения заданы в `build.gradle.kts` библиотеки и могут быть скорректированы под ваш стек.

---

### Быстрый старт в стороннем проекте (вариант с submodule)

1. Добавьте сабмодуль:

   ```bash
   git submodule add https://github.com/nahui3/android.git external/android-ui
   ```

2. В корневом `settings.gradle.kts`:

   ```kotlin
   includeBuild("external/android-ui")
   ```

3. В `app/build.gradle.kts`:

   ```kotlin
   dependencies {
       implementation(project(":nahui3-android-ui"))
   }
   ```

4. Используйте компонент:

   ```kotlin
   @Composable
   fun Example() {
       FieldWithText(label = "Ваш текст")
   }
   ```

На этом библиотека готова к использованию из любого Android-проекта.

