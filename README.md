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
8. Практика

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
1. запись значения в переменную (присвоение)
> int a <- 125
2. чтение значения из переменной
> int a: 125 ->

* В Java перед использованием переменную нужно объявить, указав её тип и имя (нестрогая или строгая типизация)
* В Java переменные могут быть простого (8 типов) и ссылочного (например массив или String) типа
* Имя переменной может содержать буквы и цифры, начинается с буквы, стиль - camelCase

Пример:
```Java
int i;
int countCycle = 10;
boolean flagError = true;
```

* Массивы хранят набор однотипных переменных
* Доступ к элементам массива происходит по номеру (индексу), нумерация начинается с 0
* Массивы являются объектами, их нужно создавать с помощью директивы new
* При создании требуется указать размерность массива или сразу инициализировать все его элементы

Примеры:
```Java
int[] arr = new int[10];
int[] initArray = {1, 2, 3, 4, 5};
arr[0] = initArray[0] + 2;
```

# 5. Условия

![image](https://github.com/user-attachments/assets/502ff61f-7245-49b8-a50e-04417a1bdf25)

![image](https://github.com/user-attachments/assets/b929f5a3-6805-43cd-a16e-76c26ebc5b3f)

* После слова if в скобках записывается логическое выражение (сравнение)
* Если результат этого выражение true, то выполняются команды в блоке { .. } до слова else, если результат false - в блоке после этого слова

Пример:
```Java
int t = -2;
if (t < 0) {
	System.out.println("It's frost");
} else {
	System.out.println("It's not frost");
}
```

* Для получения одного из двух значений в зависимости от условия удобно использовать так называемый тернарный оператор
* Если результат логического выражения в скобках true то возвращается значение слева от двоеточия
* Вопросительный знак и двоеточие являются обязательными символами

Пример:
```Java
String s;
s = (i == 10)? "i = 10" : "i != 10";
System.out.println(s);
```

* Существует также ещё одна конструкция оператора проверки условия: множественный выбор (switch)

Пример:
```Java
int i = 10;
switch (i) {
	case 10:
		System.out.println("i = 10");
		break;
	case 20:
		System.out.println("i = 20");
		break;
}
```

# 6. Циклы

![image](https://github.com/user-attachments/assets/7c9ae829-37e3-4606-be45-479067330e66)

* Циклы предназначены для повторения группы операций (команд, действий)
* Могут быть с определённым числом повторений

Пример:
```Java
for (int i = 0; i < 5; i++) {
	// тело цикла
}
```
* Могут быть без определённого числа повторений

Примеры:
```Java
while () {} // проверка перед входом
do {} while () // проверка перед выходом
```

* Команды break и continue изменяют порядок выполнения цикла

# 7. Импорт

* Java поставляется с набором пакетов
* Пакеты содержат скомпилированные классы, сгруппированные по тематике (io, util, net, и так далее)
* Чтобы использовать класс из пакета, его сначала необходимо импортировать
Пример:
```Java
import java.util.Random;
```
* На основании импортированного класса можно создать объект или вызвать его статические методы, или наследовать от него свой класс
Пример:
```Java
Random random = new Random();
```

# 8. Игра “Угадай число”

1. Создадим класс с методом main()
2. Импортируем классы Random и Scanner
3. В main() создадим объекты random и scanner
4. Объявим и инициируем 3 переменные, в том числе число, которое “загадает” компьютер
5. Опишем основной игровой цикл while. В цикле: запрос числа от пользователя, сравнение с загаданным, реакция по результату сравнения
6. Отобразим в консоли результат игры
7. Используем цикл do-while для повторения игры по запросу

# Книги по Java для новичков:

> Майк МакГрат, Java программирование для начинающих

> Кэти Сьерра, Берт Бейтс, Изучаем Java

> Яков Файн, Программирование на Java для детей, родителей, бабушек и дедушек

# Практика
* Запускаем через _cmd_ компилятор :
	- javac HelloWorld.java
 	- java HelloWorld
* Запускаем онлайн редактор _replit_ : https://replit.com/

**HelloWorld.java**
![image](https://github.com/user-attachments/assets/dbae3861-433f-440a-bac4-472d0ae1743e)

**Shell**
```Java
cd ~/.../main/java$
~/.../main/java$ cat HelloWorld.java

// моя первая программа
class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    }

~/.../main/java$ ls
HelloWorld.java
~/.../main/java$ javac HelloWorld.java
~/.../main/java$ ls
HelloWorld.class  HelloWorld.java

~/.../main/java$java HelloWorld
Hello, world!
```

```Java
// циклы
class HelloWorld2 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i + ". " + "Hello, world!");
      }
    }
}

~/.../main/java$ javac HelloWorld2.java
~/.../main/java$ java HelloWorld2
0. Hello, world!
1. Hello, world!
2. Hello, world!
3. Hello, world!
4. Hello, world!
```

```Java
// импорт библиотек
import java.util.Random;

class HelloWorld3 {
  public static void main(String[] args) {
    Random rnd = new Random();
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello, world " + rnd.nextInt(10) + "!");
      System.out.println(rnd.nextFloat(1000));
      }
    }
}

~/.../main/java$ javac HelloWorld3.java
~/.../main/java$ java HelloWorld3
Hello, world 2!
609.1372
Hello, world 6!
950.6018
Hello, world 4!
391.41296
Hello, world 3!
483.22665
Hello, world 4!
126.694855
```

```Java
// библиотека random, system
import java.util.Random;

class HelloWorld4 { 
  public static void main(String[] args) {
    Random rnd = new Random();
    for (int i = 0; i < 50; i++) {
      System.out.print(rnd.nextInt(10));
      }
    System.out.print("\n");
    for (int i = 0; i < 10; i++) {
      System.out.print(rnd.nextInt(100) + " ");
      }
    }
}

~/.../main/java$ javac HelloWorld4.java
~/.../main/java$ java HelloWorld4
50581305769570632484215472574143893343959986995603
4 62 16 23 34 55 73 61 77 69
```

> Random

> https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

```Java
// Game GuessTheNumber
import java.util.Random;
import java.util.Scanner;

class GuessTheNumber { 
  public static void main(String[] args) {
    Random rnd = new Random();
    Scanner scanr = new Scanner(System.in);
    int counter, guess, number;
    
    do {
      counter = 0;
      guess = -1;
      number = rnd.nextInt(10);

      while (counter < 3 && guess != number) {
        System.out.print("Guess the number 0...9: ");
        guess = scanr.nextInt();
        if (guess != number) {
          System.out.println("Your number is " + (guess < number ? "less" : "greater"));
          counter++;
          }
      }
      System.out.println("You " + (guess == number ? "win" : "lose") + "! Number was " + number);
      System.out.print("One more game? Yes -- 1 or No -- 0: ");

    } while (scanr.nextInt() == 1);
  }
}


~/.../main/java$ javac GuessTheNumber.java
~/.../main/java$ java GuessTheNumber
Guess the number 0...9: 5
Your number is less
Guess the number 0...9: 1
Your number is less
Guess the number 0...9: 2
Your number is less
You lose! Number was 6
One more game? Yes -- 1 or No -- 0: 1
Guess the number 0...9: 0
Your number is less
Guess the number 0...9: 1
Your number is less
Guess the number 0...9: 2
Your number is less
You lose! Number was 5
One more game? Yes -- 1 or No -- 0: 0
```
