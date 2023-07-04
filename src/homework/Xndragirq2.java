package homework;

public class Xndragirq2 {
    public static void main(String[] args) {

        int a = -200, b = 9, c = -500, d = -7;

        //Task 31
        System.out.println("------------------------");
        System.out.println("Task 31 -> Թվերից Մեծագույնի արժեքը");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + " d = " + d);
        System.out.println("-------------------------");

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

        //Task 32
        System.out.println("\n------------------------");
        System.out.println("Task 32 -> Թվերից Փոքրագույնի արժեքը");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

        //Task 33
        System.out.println("\n------------------------");
        System.out.println("Task 33 -> Թվերից Գոնե մեկը հավասար է մեկի տպել true else false");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        //Task 34
        System.out.println("\n------------------------");
        System.out.println("Task 34 -> Թվերից երկուսի գումարը հավասար են մյուս երկուսի գումարին տպել true else false");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if (a + b == c + d || a + d == b + c || a + c == d + b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 35
        System.out.println("\n------------------------");
        System.out.println("Task 35 -> Թվերից մեկը հավասար է մյուս երեքի գումարին տպել true else false");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 36
        System.out.println("\n------------------------");
        System.out.println("Task 36 -> Թվերից գոնե երկուս կենտ են տպել 1 else 2");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if (a % 2 != 0 && b % 2 != 0 ||
                c % 2 != 0 && d % 2 != 0 ||
                a % 2 != 0 && c % 2 != 0 ||
                b % 2 != 0 && d % 2 != 0 ||
                b % 2 != 0 && c % 2 != 0 ||
                a % 2 != 0 && d % 2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }


        //Task 37
        System.out.println("\n------------------------");
        System.out.println("Task 37 ->  Եթե Թվաբանական Պրոգրեսիա են true else false");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if ((b - a == c - b) && (b - a == c - d)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 39
        System.out.println("\n------------------------");
        System.out.println("Task 38 -> Եթե Թվերը Երկրաչափական պրոգրեսիա են true else false");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        double a1 = 2, b1 = 4, c1 = 8, d1 = 16;
        if ((b1 / a1 == c1 / b1) && (b1 / a1 == d1 / c1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 39
        System.out.println("\n------------------------");
        System.out.println("Task 39 -> Թվերը Ըստ աճման կարգի");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + "d = " + d);
        System.out.println("------------------------");

        if (a < b && a < c && a < d) {
            if (b < c && b < d) {
                if (c < d) {
                    System.out.println(a + "->" + b + "->" + c + "->" + d);
                } else {
                    System.out.println(a + "->" + b + "->" + d + "->" + c);
                }
            } else if (c < b && c < d) {
                if (b < d) {
                    System.out.println(a + "->" + c + "->" + b + "->" + d);
                } else {
                    System.out.println(a + "->" + c + "->" + d + "->" + b);
                }
            } else {
                if (b < c) {
                    System.out.println(a + "->" + d + "->" + b + "->" + c);
                } else {
                    System.out.println(a + "->" + d + "->" + c + "->" + b);
                }
            }
        } else if (b < c && b < d) {
            if (a < c && a < d) {
                if (c < d) {
                    System.out.println(b + "->" + a + "->" + c + "->" + d);
                } else {
                    System.out.println(b + "->" + a + "->" + d + "->" + c);
                }
            } else if (c < a && c < d) {
                if (a < d) {
                    System.out.println(b + "->" + c + "->" + a + "->" + d);
                } else {
                    System.out.println(b + "->" + c + "->" + d + "->" + a);
                }
            } else {
                if (a < c) {
                    System.out.println(b + "->" + d + "->" + a + "->" + c);
                } else {
                    System.out.println(b + "->" + d + "->" + c + "->" + a);
                }
            }
        } else if (c < d) {
            if (a < b && a < d) {
                if (b < d) {
                    System.out.println(c + "->" + a + "->" + b + "->" + d);
                } else {
                    System.out.println(c + "->" + a + "->" + d + "->" + b);
                }
            } else if (b < a && b < d) {
                if (a < d) {
                    System.out.println(c + "->" + b + "->" + a + "->" + d);
                } else {
                    System.out.println(c + "->" + b + "->" + d + "->" + a);
                }
            } else {
                if (a < b) {
                    System.out.println(c + "->" + d + "->" + a + "->" + b);
                } else {
                    System.out.println(c + "->" + d + "->" + b + "->" + a);
                }
            }
        } else {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println(d + "->" + a + "->" + b + "->" + c);
                } else {
                    System.out.println(d + "->" + a + "->" + c + "->" + b);
                }
            } else if (b < a && b < c) {
                if (a < c) {
                    System.out.println(d + "->" + b + "->" + a + "->" + c);
                } else {
                    System.out.println(d + "->" + b + "->" + c + "->" + a);
                }
            } else {
                if (a < b) {
                    System.out.println(d + "->" + c + "->" + a + "->" + b);
                } else {
                    System.out.println(d + "->" + c + "->" + b + "->" + a);
                }
            }
        }


        //Task 40
        System.out.println("\n------------------------");
        System.out.println("Task 40 -> Թվերը Ըստ նվազման կարգի");
        System.out.println("a = " + a + " , " + "b = " + b + " , " + "c = " + c + " , " + " d = " + d);
        System.out.println("-------------------------");

        if (a > b && a > c && a > d) {
            if (b > c && b > d) {
                if (c > d) {
                    System.out.println(a + "->" + b + "->" + c + "->" + d);
                } else {
                    System.out.println(a + "->" + b + "->" + d + "->" + c);
                }
            } else if (c > b && c > d) {
                if (b > d) {
                    System.out.println(a + "->" + c + "->" + b + "->" + d);
                } else {
                    System.out.println(a + "->" + c + "->" + d + "->" + b);
                }
            } else {
                if (b > c) {
                    System.out.println(a + "->" + d + "->" + b + "->" + c);
                } else {
                    System.out.println(a + "->" + d + "->" + c + "->" + b);
                }
            }
        } else if (b > c && b > d) {
            if (a > c && a > d) {
                if (c > d) {
                    System.out.println(b + "->" + a + "->" + c + "->" + d);
                } else {
                    System.out.println(b + "->" + a + "->" + d + "->" + c);
                }
            } else if (c > a && c > d) {
                if (a > d) {
                    System.out.println(b + "->" + c + "->" + a + "->" + d);
                } else {
                    System.out.println(b + "->" + c + "->" + d + "->" + a);
                }
            } else {
                if (a > c) {
                    System.out.println(b + "->" + d + "->" + a + "->" + c);
                } else {
                    System.out.println(b + "->" + d + "->" + c + "->" + a);
                }
            }
        } else if (c > d) {
            if (a > b && a > d) {
                if (b > d) {
                    System.out.println(c + "->" + a + "->" + b + "->" + d);
                } else {
                    System.out.println(c + "->" + a + "->" + d + "->" + b);
                }
            } else if (b > a && b > d) {
                if (a > d) {
                    System.out.println(c + "->" + b + "->" + a + "->" + d);
                } else {
                    System.out.println(c + "->" + b + "->" + d + "->" + a);
                }
            } else {
                if (a > b) {
                    System.out.println(c + "->" + d + "->" + a + "->" + b);
                } else {
                    System.out.println(c + "->" + d + "->" + b + "->" + a);
                }
            }
        } else {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(d + "->" + a + "->" + b + "->" + c);
                } else {
                    System.out.println(d + "->" + a + "->" + c + "->" + b);
                }
            } else if (b > a && b > c) {
                if (a > c) {
                    System.out.println(d + "->" + b + "->" + a + "->" + c);
                } else {
                    System.out.println(d + "->" + b + "->" + c + "->" + a);
                }
            } else {
                if (a > b) {
                    System.out.println(d + "->" + c + "->" + a + "->" + b);
                } else {
                    System.out.println(d + "->" + c + "->" + b + "->" + a);
                }
            }
        }


    }
}
