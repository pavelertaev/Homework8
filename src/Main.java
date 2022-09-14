public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] weights = {90 , 91 , 93 , 95 ,85 , 87 , 89 , 0 , 0, 0, 0 , 0 };
        weights[0] = 90;
        int januaryWeigth = weights[0];
        System.out.println(januaryWeigth);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        //Массивы Задание 1
        //Объявите три массива:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //3. Произвольный массив – тип и количество данных определите сами.
        //Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("Задание 1");
        int [] a = new int[3];
        a[0]= 1;
        a[1]= 2;
        a[2]=3;
        System.out.println(a[0]);
        double [] b = {1.57 , 7.654 , 9.986};
        System.out.println(b[1]);
        char [] c = new char[2];
        c[0]= 2;
        c[1] =3;
        System.out.println(c[1]);



        //Массивы Задание 2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        System.out.println("Задание 2");
        int [] d = new int[3];
        d[0]= 1;
        d[1]= 2;
        d[2]= 3;
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + ",");

        }

        System.out.println();
        double [] y = {1.57 , 7.654 , 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(y[i] + ",");
        }

        System.out.println();
        char [] h = new char[2];
        h[0]= 2;
        h[1] =3;
        for (int i = 0; i < 2; i++) {
            System.out.print(h[i] + " ,");

        }
        System.out.println();



        //Массивы задание 3
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        //а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        // Если во втором задании в консоль у вас вывелся результат
        System.out.println("Задание 3");
        int [] arr = new int[3];
        arr[0]= 1;
        arr[1]= 2;
        arr[2]= 3;
        for (int i = 2; i > -1; i--) {
            System.out.print(arr[i] + " ,");
        }

        System.out.println();
        double [] arr1 = {1.57 , 7.654 , 9.986 };
        for (int i = 2; i > -1; i--) {
            System.out.print(arr1[i] + " ,");




        }
        System.out.println();

        char [] arr2 = new char[2];
        arr2[0]= 2;
        arr2[1] =3;
        for (int i = 1; i > -1; i--) {
            System.out.print( arr2[i] + " ," );


        }

        System.out.println();


        //Массивы Задание 4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        System.out.println("Задание 4");
        int [] n = new int[3];
        n[0]= 1;
        n[1]= 2;
        n[2]= 3;
        for (int i = 0; i < n.length; i++) {
            if (n[i]%2!=0){
                n[i]+=1;
            }
            System.out.println(n[i]);
        }

    }

    }
