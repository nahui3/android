## android

Frontend for Android — маленькая Compose-библиотека с компонентом `FieldWithText` (поле ввода + текст под ним).

### Быстрое подключение к проекту (Git submodule + included build)

1. Добавьте этот репозиторий как сабмодуль в ваш Android-проект:

   ```bash
   git submodule add https://github.com/nahui3/android.git external/android-ui
   ```

2. В корневом `settings.gradle.kts` вашего проекта:

   ```kotlin
   includeBuild("external/android-ui")
   ```

3. В модуле приложения (например, `app/build.gradle.kts`):

   ```kotlin
   dependencies {
       implementation(project(":nahui3-android-ui"))
   }
   ```

4. Используйте компонент в любом `@Composable`:

   ```kotlin
   import com.nahui3.android.ui.FieldWithText

   @Composable
   fun Example() {
       FieldWithText(label = "Ваш текст")
   }
   ```

### Подробнее

- подробная документация по вариантам подключения, требованиям к окружению и дополнительным примерам: см. `docs/USAGE.md`.


