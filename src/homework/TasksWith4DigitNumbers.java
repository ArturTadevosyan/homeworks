package homework;

public class TasksWith4DigitNumbers {
    public static void main(String[] args) {

        int number1 = -200, number2 = 9, number3 = -500, number4 = -7;

        //Task 31
        System.out.println("------------------------");
        System.out.println("Task 31 -> Թվերից Մեծագույնի արժեքը");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("-------------------------");

        if (number1 > number2 && number1 > number3 && number1 > number4) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println(number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println(number3);
        } else {
            System.out.println(number4);
        }

        //Task 32
        System.out.println("\n------------------------");
        System.out.println("Task 32 -> Թվերից Փոքրագույնի արժեքը");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if (number1 < number2 && number1 < number3 && number1 < number4) {
            System.out.println(number1);
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println(number2);
        } else if (number3 < number1 && number3 < number2 && number3 < number4) {
            System.out.println(number3);
        } else {
            System.out.println(number4);
        }

        //Task 33
        System.out.println("\n------------------------");
        System.out.println("Task 33 -> Թվերից Գոնե մեկը հավասար է մեկի տպել true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if (number1 == 1 || number2 == 1 || number3 == 1 || number4 == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        //Task 34
        System.out.println("\n------------------------");
        System.out.println("Task 34 -> Թվերից երկուսի գումարը հավասար են մյուս երկուսի գումարին տպել true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if (number1 + number2 == number3 + number4 || number1 + number4 == number2 + number3 || number1 + number3 == number4 + number2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 35
        System.out.println("\n------------------------");
        System.out.println("Task 35 -> Թվերից մեկը հավասար է մյուս երեքի գումարին տպել true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if (number1 == number2 + number3 + number4 || number2 == number1 + number3 + number4 || number3 == number1 + number2 + number4 || number4 == number1 + number2 + number3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 36
        System.out.println("\n------------------------");
        System.out.println("Task 36 -> Թվերից գոնե երկուս կենտ են տպել 1 հակառակ դեպքում 2");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if (number1 % 2 != 0 && number2 % 2 != 0 ||
                number3 % 2 != 0 && number4 % 2 != 0 ||
                number1 % 2 != 0 && number3 % 2 != 0 ||
                number2 % 2 != 0 && number4 % 2 != 0 ||
                number2 % 2 != 0 && number3 % 2 != 0 ||
                number1 % 2 != 0 && number4 % 2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }


        //Task 37
        System.out.println("\n------------------------");
        System.out.println("Task 37 ->  Եթե Թվաբանական Պրոգրեսիա են true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if ((number2 - number1 == number3 - number2) && (number2 - number1 == number3 - number4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 39
        System.out.println("\n------------------------");
        System.out.println("Task 38 -> Եթե Թվերը Երկրաչափական պրոգրեսիա են true հակառակ դեպքում false");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        double numberD1 = 2, numberD2 = 4, numberD3 = 8, numberD4 = 16;
        if ((numberD2 / numberD1 == numberD3 / numberD2) && (numberD2 / numberD1 == numberD4 / numberD3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 39
        System.out.println("\n------------------------");
        System.out.println("Task 39 -> Թվերը Ըստ աճման կարգի");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("------------------------");

        if (number1 < number2 && number1 < number3 && number1 < number4) {
            if (number2 < number3 && number2 < number4) {
                if (number3 < number4) {
                    System.out.println(number1 + "->" + number2 + "->" + number3 + "->" + number4);
                } else {
                    System.out.println(number1 + "->" + number2 + "->" + number4 + "->" + number3);
                }
            } else if (number3 < number2 && number3 < number4) {
                if (number2 < number4) {
                    System.out.println(number1 + "->" + number3 + "->" + number2 + "->" + number4);
                } else {
                    System.out.println(number1 + "->" + number3 + "->" + number4 + "->" + number2);
                }
            } else {
                if (number2 < number3) {
                    System.out.println(number1 + "->" + number4 + "->" + number2 + "->" + number3);
                } else {
                    System.out.println(number1 + "->" + number4 + "->" + number3 + "->" + number2);
                }
            }
        } else if (number2 < number3 && number2 < number4) {
            if (number1 < number3 && number1 < number4) {
                if (number3 < number4) {
                    System.out.println(number2 + "->" + number1 + "->" + number3 + "->" + number4);
                } else {
                    System.out.println(number2 + "->" + number1 + "->" + number4 + "->" + number3);
                }
            } else if (number3 < number1 && number3 < number4) {
                if (number1 < number4) {
                    System.out.println(number2 + "->" + number3 + "->" + number1 + "->" + number4);
                } else {
                    System.out.println(number2 + "->" + number3 + "->" + number4 + "->" + number1);
                }
            } else {
                if (number1 < number3) {
                    System.out.println(number2 + "->" + number4 + "->" + number1 + "->" + number3);
                } else {
                    System.out.println(number2 + "->" + number4 + "->" + number3 + "->" + number1);
                }
            }
        } else if (number3 < number4) {
            if (number1 < number2 && number1 < number4) {
                if (number2 < number4) {
                    System.out.println(number3 + "->" + number1 + "->" + number2 + "->" + number4);
                } else {
                    System.out.println(number3 + "->" + number1 + "->" + number4 + "->" + number2);
                }
            } else if (number2 < number1 && number2 < number4) {
                if (number1 < number4) {
                    System.out.println(number3 + "->" + number2 + "->" + number1 + "->" + number4);
                } else {
                    System.out.println(number3 + "->" + number2 + "->" + number4 + "->" + number1);
                }
            } else {
                if (number1 < number2) {
                    System.out.println(number3 + "->" + number4 + "->" + number1 + "->" + number2);
                } else {
                    System.out.println(number3 + "->" + number4 + "->" + number2 + "->" + number1);
                }
            }
        } else {
            if (number1 < number2 && number1 < number3) {
                if (number2 < number3) {
                    System.out.println(number4 + "->" + number1 + "->" + number2 + "->" + number3);
                } else {
                    System.out.println(number4 + "->" + number1 + "->" + number3 + "->" + number2);
                }
            } else if (number2 < number1 && number2 < number3) {
                if (number1 < number3) {
                    System.out.println(number4 + "->" + number2 + "->" + number1 + "->" + number3);
                } else {
                    System.out.println(number4 + "->" + number2 + "->" + number3 + "->" + number1);
                }
            } else {
                if (number1 < number2) {
                    System.out.println(number4 + "->" + number3 + "->" + number1 + "->" + number2);
                } else {
                    System.out.println(number4 + "->" + number3 + "->" + number2 + "->" + number1);
                }
            }
        }


        //Task 40
        System.out.println("\n------------------------");
        System.out.println("Task 40 -> Թվերը Ըստ նվազման կարգի");
        System.out.println("number1 = " + number1 + " , " + "number2 = " + number2 + " , " + "number3 = " + number3 + " , " + " number4 = " + number4);
        System.out.println("-------------------------");

        if (number1 > number2 && number1 > number3 && number1 > number4) {
            if (number2 > number3 && number2 > number4) {
                if (number3 > number4) {
                    System.out.println(number1 + "->" + number2 + "->" + number3 + "->" + number4);
                } else {
                    System.out.println(number1 + "->" + number2 + "->" + number4 + "->" + number3);
                }
            } else if (number3 > number2 && number3 > number4) {
                if (number2 > number4) {
                    System.out.println(number1 + "->" + number3 + "->" + number2 + "->" + number4);
                } else {
                    System.out.println(number1 + "->" + number3 + "->" + number4 + "->" + number2);
                }
            } else {
                if (number2 > number3) {
                    System.out.println(number1 + "->" + number4 + "->" + number2 + "->" + number3);
                } else {
                    System.out.println(number1 + "->" + number4 + "->" + number3 + "->" + number2);
                }
            }
        } else if (number2 > number3 && number2 > number4) {
            if (number1 > number3 && number1 > number4) {
                if (number3 > number4) {
                    System.out.println(number2 + "->" + number1 + "->" + number3 + "->" + number4);
                } else {
                    System.out.println(number2 + "->" + number1 + "->" + number4 + "->" + number3);
                }
            } else if (number3 > number1 && number3 > number4) {
                if (number1 > number4) {
                    System.out.println(number2 + "->" + number3 + "->" + number1 + "->" + number4);
                } else {
                    System.out.println(number2 + "->" + number3 + "->" + number4 + "->" + number1);
                }
            } else {
                if (number1 > number3) {
                    System.out.println(number2 + "->" + number4 + "->" + number1 + "->" + number3);
                } else {
                    System.out.println(number2 + "->" + number4 + "->" + number3 + "->" + number1);
                }
            }
        } else if (number3 > number4) {
            if (number1 > number2 && number1 > number4) {
                if (number2 > number4) {
                    System.out.println(number3 + "->" + number1 + "->" + number2 + "->" + number4);
                } else {
                    System.out.println(number3 + "->" + number1 + "->" + number4 + "->" + number2);
                }
            } else if (number2 > number1 && number2 > number4) {
                if (number1 > number4) {
                    System.out.println(number3 + "->" + number2 + "->" + number1 + "->" + number4);
                } else {
                    System.out.println(number3 + "->" + number2 + "->" + number4 + "->" + number1);
                }
            } else {
                if (number1 > number2) {
                    System.out.println(number3 + "->" + number4 + "->" + number1 + "->" + number2);
                } else {
                    System.out.println(number3 + "->" + number4 + "->" + number2 + "->" + number1);
                }
            }
        } else {
            if (number1 > number2 && number1 > number3) {
                if (number2 > number3) {
                    System.out.println(number4 + "->" + number1 + "->" + number2 + "->" + number3);
                } else {
                    System.out.println(number4 + "->" + number1 + "->" + number3 + "->" + number2);
                }
            } else if (number2 > number1 && number2 > number3) {
                if (number1 > number3) {
                    System.out.println(number4 + "->" + number2 + "->" + number1 + "->" + number3);
                } else {
                    System.out.println(number4 + "->" + number2 + "->" + number3 + "->" + number1);
                }
            } else {
                if (number1 > number2) {
                    System.out.println(number4 + "->" + number3 + "->" + number1 + "->" + number2);
                } else {
                    System.out.println(number4 + "->" + number3 + "->" + number2 + "->" + number1);
                }
            }
        }


    }
}
