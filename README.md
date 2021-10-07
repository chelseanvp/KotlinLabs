# Лабораторные работы по современным платформам программирования 
### Репозиторий содержит только исходый код работ
> Для реализации был выбран язык Kotlin 


## [Лабораторная работа №1](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab1)
### [Задание 1](https://github.com/chelseanvp/KotlinLabs/blob/main/Lab1/src/main/kotlin/Task1.kt)
> + Для данной последовательности, выводит значение «равны» если все элементы последователь-
ности равны и «не равны», в противном случае.
> + Вывод максимального и минимального значения, а также суммы и произведения элементов
последовательности.
> + Вывод моды последовательности. Модой ряда чисел называется число, которое встречается в
данном ряду чаще других. Последовательность может иметь более одной моды, а может не
иметь ни одной.
> + Вывод суммы квадратов всех отрицательных чисел.
### [Задание 2](https://github.com/chelseanvp/KotlinLabs/blob/main/Lab1/src/main/kotlin/Task2.kt)
> + Написать метод add(double[] array, int index, double element), который добавляет в массив
еще один элемент по указанному индексу.
### [Задание 3](https://github.com/chelseanvp/KotlinLabs/blob/main/Lab1/src/main/kotlin/Task3.kt)
> + Напишите метод String repeat(char ch, int repeat) который строит строку из указанного
символа, повторённого заданное количество раз.
#### - Для компиляции программы следует следует запустить в терминале [Исполняемый файл](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab1/out/artifacts/SPP_Lab1_jar)
#### - Пример: java -jar SPP_Lab1.jar 1 2 3 4


## [Лабораторная работа №2](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab2)
### [Задание 1](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab2/src/main/kotlin/task1)
> #### Напишите программу, выполняющую чтение текстовых данных из файла и их последующую обработку:
> + Напишите программу, которая выводит слова, располагая их в порядке убывания частоты их
появления. Перед каждым словом должно быть число его появлений.
### [Задание 2](https://github.com/chelseanvp/KotlinLabs/blob/main/Lab1/src/main/kotlin/Task1.kt)
> Утилита join объединяет строки двух упорядоченных текстовых файлов на основе наличия
общего поля. По своему функционалу схоже с оператором JOIN , используемого в языке SQL
для реляционных баз данных, но оперирует с текстовыми файлами.
Команда join принимает на входе два текстовых файла и некоторое число аргументов. Если не
передаются никакие аргументы командной строки, то данная команда ищет пары строк в двух
файлах, обладающие совпадающим первым полем (последовательностью символов, отличных
от пробела), и выводит строку, состоящую из первого поля и содержимого обоих строк.
Ключами -1 или -2 задаются номера сравниваемых полей для первого и второго файла, соот-
ветственно. Если в качестве одного из файлов указано – (но не обоих сразу!), то в этом случае вместо файла считывается стандартный ввод.
#### Формат использования:
join [-1 номер_поля] [-2 номер_поля] файл1 файл2 [файл3]
#### Параметры:
+  1 fiedl_num Задает номер поля в строке для первого файла, по которому будет выпол-
няться соединение.
+  2 field_num Задает номер поля в строке для второго файла, по которому будет выпол-
няться соединение.
#### Аргументы: ###
+ файл1, файл2 – входные файлы
+ файл3 – выходной файл, куда записывается результат работы программы.


## [Лабораторная работа №3](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab3)
### [Задание 1](https://github.com/chelseanvp/KotlinLabs/blob/main/Lab3/src/main/kotlin/Task1.kt)
#### Реализовать простой класс
#### Требования к выполнению: 
+ Реализовать пользовательский класс по варианту.
+ Создать другой класс с методом main, в котором будут находится примеры использования
пользовательского класса.
Для каждого класса
+ Создать поля классов
+ Создать методы классов
+ Добавьте необходимые get и set методы (по необходимости)
+ Укажите соответствующие модификаторы видимости
+ Добавьте конструкторы
+ Переопределить методы toString() и equals()
#### Задание по варианту:
> Множество целых чисел переменной мощности – Предусмотреть возможность пересече-
ния двух множеств, вывода на печать элементов множества, а так же метод, определяющий,
принадлежит ли указанное значение множеству. Класс должен содержать методы, позволя-
ющие добавлять и удалять элемент в/из множества. Конструктор должен позволить созда-
вать объекты с начальной инициализацией. Реализацию множества осуществить на базе
структуры ArrayList. Реализовать метод equals, выполняющий сравнение объектов данного
типа.
### [Задание 2](https://github.com/chelseanvp/KotlinLabs/blob/main/Lab3/src/main/kotlin/Task2.kt)
#### Требования к выполнению:
+ Задание посвящено написанию классов, решающих определенную задачу автоматизации;
+ Данные для программы загружаются из файла (формат произволен). Файл создать и написать вручную.
#### Задание по варианту:
>Автоматизированная система обработки информации об авиарейсах
>Написать программу для обработки информации об авиарейсах (Airlines): Каждый рейс имеет
>следующие характеристики:
> + Пункт назначения;
> + Номер рейса;
> + Тип самолета;
> + Время вылета;
> + Дни недели, по которым совершаются рейсы.
#### Программа должна обеспечить:
> + Генерацию списка рейсов;
> + Вывод списка рейсов для заданного пункта назначения;
> + Вывод списка рейсов для заданного дня недели;
> + Вывод списка рейсов для заданного дня недели, время вылета для которых больше задан-
ного;
> + Все рейсы самолетов некоторого типа;
> + Группировка рейсов по числу пассажиров (маломестные - 1-100 чел, средместные (100-
200), крупные рейсы (200-350));
> +  Все рейсы самолетов туда-обратно.


## [Лабораторная работа №4](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab4)
### [Задание 1](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab4/src/main/kotlin/task1)
#### Требования к выполнению:
+ Реализовать указанный класс, включив в него вспомогательный внутренний класс или классы.
+ Реализовать 2-3 метода (на выбор). Продемонстрировать использование реализованных классов.
#### Задание по варианту:
>Создать класс Mobile с внутренним классом, с помощью объектов которого можно хранить
>информацию о моделях телефонов и их свойствах.
### [Задание 2](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab4/src/main/kotlin/task2)
#### Требования к выполнению:
+ Реализовать агрегирование. При создании класса агрегируемый класс объявляется как атрибут(локальная переменная, параметр метода). 
+ Включить в каждый класс 2-3 метода на выбор. 
+ Продемонстрировать использование разработанных классов.
#### Задание по варианту:
>Создать класс Страница, используя класс Слово.
### [Задание 3](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab4/src/main/kotlin/task3)
#### Требования к выполнению:
+ Построить модель программной системы с применением отношений (обобщения, агрегации, ассоциации, реализации) между классами.
+ Задать атрибуты и методы классов. 
+ Реализовать (если необ-ходимо) дополнительные классы. 
+ Продемонстрировать работу разработанной системы.
#### Задание по варианту:
>Система Автобаза. Диспетчер распределяет заявки на Рейсы между Водителями и назначает для этого Автомобиль. Водитель может сделать заявку на ремонт. Диспетчер может
отстранить Водителя от работы. Водитель делает отметку о выполнении Рейса и состоянии
Автомобиля.


## [Лабораторная работа №5](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab5)
### [Задание 1](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab5/src/main/kotlin/task1)
#### Требования к выполнению:
+ Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов:
#### Задание по варианту:
+ interface Здание ← abstract class Общественное Здание ← class Театр.
### [Задание 2](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab5/src/main/kotlin/task2)
#### Требования к выполнению:
+ В следующих заданиях требуется создать суперкласс (абстрактный класс, интерфейс) и опре-
делить общие методы для данного класса. 
+ Создать подклассы, в которых добавить специфическиесвойства и методы. Часть методов переопределить. 
+ Создать массив объектов суперкласса и заполнить объектами подклассов. 
+ Объекты подклассов идентифицировать конструктором по имени или идентификационному номеру. 
+ Использовать объекты подклассов для моделирования реальных ситуаций и объектов.
#### Задание по варианту:
> Создать суперкласс Учащийся и подклассы Школьник и Студент. 
> Создать массив объектов суперкласса и заполнить этот массив объектами. 
> Показать отдельно студентов и школьников.


## [Лабораторная работа №6](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab6)
#### Общии требования к выполнению:
+ Прочитать задания, взятые из каждой группы.
+ Определить паттерн проектирования, который может использоваться при реализации задания.Пояснить свой выбор.
+ Реализовать фрагмент программной системы, используя выбранный паттерн. Реализовать все необходимые дополнительные классы.
### [Задание 1](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab6/src/main/kotlin/Task1)
#### Задание по варианту:
> Музыкальный магазин. Должно обеспечиваться одновременное обслуживание нескольких покупателей. Магазин должен предоставлять широкий выбор товаров различных музыкальных направлений.
### [Задание 2](https://github.com/chelseanvp/KotlinLabs/tree/main/Lab6/src/main/kotlin/task2)
#### Задание по варианту:
> Учетная запись покупателя книжного интернет-магазина. Предусмотреть различные уровни учетки в зависимости от активности покупателя. Дополнительные уровни добавляют функциональные возможности и открывают доступ к уникальным предложениям.









