Простое шахматное поле с фигурами на JFrame.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA. Проконтролируйте, чтобы версии Gradle JVM, Java и JDK соответствовали указанным ниже.

| Технология | Версия  | Пояснение                                    | Примечание                                                       |
|------------|---------|----------------------------------------------|------------------------------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки         | -                                                                |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle | [Настраивается в переменных средах ОС (JAVA_HOME и Path)][Link1] |
| Kotlin     | 1.9.20  | Версия Kotlin, используемая в проекте        | -                                                                |
| Java       | 17      | Language Level, используемый в проекте       | [Настраивается в IntelliJ IDEA (Project Structure)][Link2]       |
| JDK        | 17.0.9  | Версия SDK, используемая в проекте           | [Настраивается в IntelliJ IDEA (Project Structure)][Link2]       |

[Link1]: https://java-lessons.ru/first-steps/java-home#:~:text=Теперь%20щёлкните%20правой%20кнопкой
[Link2]: https://www.jetbrains.com/help/idea/sdk.html#change-module-sdk

## Использование

Запустить скомпилированный jar-файл двойным нажатием ЛКМ, либо открыть консоль Windows в папке с jar-файлом и выполнить команду `java -jar JarFileName.jar`. Откроется интуитивно понятный графический интерфейс.