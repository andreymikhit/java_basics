# java_basics
GeekBrains
# Java для начинающих

### Урок. Разработка простой игры на языке Java
1. Установка JDK (Java Development Kit) с веб-сайта Oracle и Установка среды выполнения Java (IntelliJ IDEA, Eclipse или NetBeans);
2. Изучение синтаксиса Java;
3. Изучение Java Core;
4. Изучение коллекций Java;
5. Изучение популярных библиотек и фреймворков;
6. Изучение часто используемых API (например, сервлетов, JSP, JDBC, JUnit);
7. Освоение Git и т.д.

**Особенности Java**
* Один из популярных языков программирования
* Возможность вести разработку
* для Desktop (swing, JavaFX) - настольные системы
* для Web (backend) - интернет
* для Android - мобильные системы
* для Embedded system - встроенные системы
* Достаточно лёгкий в освоении
* Объектно-ориентированный код
* Управление памятью, автоматическая сборка мусора
* Встроенная поддержка многопоточности
* Умный компилятор
* Кросс-платформенность

# 1. Java Development Kit
* JDK - пакет программ для разработчика, его предлагает компания oracle.com. Свободная версия 8u202 лучше всего подходит для начального знакомства.
* Содержит много компонентов, но нам потребуется:
* Компилятор, вызывается командой javac
* Виртуальная машина JVM, вызывается - java
* JRE - пакет для запуска скомпилированных java программ, содержит только виртуальную машину JVM
* Альтернативный вариант - онлайн-JDK + редактор
https://replit.com/

#### Устанавливать Java JDK  будем в 3 этапа:

1. Загрузка с сайта пакета _JDK_ (Java Development Kit)
https://www.oracle.com/java/technologies/downloads/?er=221886
Windows: _x64_
Linux: _x64 Debian Package_

2. Установка JDK (Java Development Kit)
Запускаем установщик с правами администратора и устанавливаем всё по умолчанию, ничего не меняя в процессе.

3. Настройка переменных окружения
Инсталлятор Java не выполняет настройку переменных окружения, поэтому придётся нам это делать вручную после установки.
_JAVA_HOME_ — переменная, указывающая на директорию, в которую установлена Java. Программы её используют чтобы определить, где установлена Java.
Для этого комбинацией клавиш Win+R открываем окно «Выполнить«. Набираем команду: «control /name microsoft.system« без кавычек.

![image](https://github.com/user-attachments/assets/bb2dbff1-0e36-4968-b853-21154a418703)

Затем нужно выбрать «Дополнительные параметры системы» и в открывшемся окне «Свойства системы»  нажимаем кнопку «Переменные среды«. Если Вы ничего не меняли при установке JDK, то путь будет таким: «C: \ Program Files \ Java \ jdkНомерВерсии».

![image](https://github.com/user-attachments/assets/c08c48df-3a98-41a8-ae06-f4a956cbc1c2)

Далее необходимо отредактировать значение переменной PATH, добавив туда путь к директории, где находятся исполняемые файлы Java, то есть

%JAVA_HOME%\bin
