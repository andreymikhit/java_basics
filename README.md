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

> %JAVA_HOME%\bin

![image](https://github.com/user-attachments/assets/850e07b7-2667-43ac-83d4-843776f67b09)

4. Тест конфигурации

Открываем командную строку и вводим:

> echo %JAVA_HOME%
Выводит директорию где установлено Java JDK.

>  javac -version
Выведет версию java-компилятора, если переменная PATH установлена ​​правильно.

# 2. Написание кода
Windows
- Notepad++ https://notepad-plus-plus.org
Windows, Linux и Mac
- Atom https://atom.io
- Geany www.geany.org

# 3. HelloWorld

```Java
// моя первая программа
class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
}
}
```

**HelloWorld** - класс, минимальный “строительный кирпичик” кода. Приложение состоит из классов. Класс может содержать поля, методы и классы. Имя класса записывается в стиле _CamelCase_.

**main()** - метод, “стартовый метод”, содержит набор команд или код. Имена методов пишутся в _camelCase_.

```CMD
C:\Users\user>javac HelloWorld.java

C:\Users\user>java HelloWorld
Hello, world!

C:\Users\user>
```

**шаблон**
```Java
// мой первый шаблон
class <ИмяКласса> {
	public static void main(String[] args) {
		// код для выполнения
}
}
```

**HelloWorld** класс можно использовать как шаблон для написания простых программ на Java.
Заменяем <ИмяКласса> своим именем класса, а внутрь метода main() вписываем свой код для выполнения
не забываем сохранять класс в файл, имя которого равно имени класса, с точностью до регистра + ‘.java’

**Компилятор и интерпретатор**

![image](https://github.com/user-attachments/assets/434c8b5b-6f00-4317-8b67-8ed4987de025)

**Компиляция и JVM**

![image](https://github.com/user-attachments/assets/c4beff13-1455-4902-b747-fcb08f6b00e2)


# 4. Переменные

* Переменные хранят данные (числа, символы, строки, логические значения)
* Переменную можно уподобить коробке. Надпись на коробке - тип и имя переменной, а внутри находится значение
* Возможны две операции
* * запись значения в переменную (присвоение)
> int a <- 125
* * чтение значения из переменной
> int a: 125 ->





