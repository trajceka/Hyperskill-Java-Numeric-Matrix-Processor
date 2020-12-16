package processor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        boolean isloop = true;
        while (isloop) {
            fs();
            String input = scanner.next();
            if ("0".equals(input)) {
                isloop = false;
                break;
            } else if ("1".equals(input)) {
                addmat(scanner);
            } else if ("2".equals(input)) {
                cmultmat(scanner);
            } else if ("3".equals(input)) {
                multmat(scanner);
            } else if ("4".equals(input)) {
                ts(scanner);
            } else if ("5".equals(input)) {
                determin(scanner);
            } else if ("6".equals(input)) {
                inversin(scanner);
            }
        }
    }
    
    public static void fs() {
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix by a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
    }
    
    public static void ts(Scanner scanner) {	    
		boolean islo = true;
        while (islo) {
		    System.out.println("1. Main diagonal");
        	System.out.println("2. Side diagonal");
        	System.out.println("3. Vertical line");
        	System.out.println("4. Horizontal line");
        	System.out.print("Your choice: ");
	    	String inp = scanner.next();
            if ("0".equals(inp)) {
                islo = false;
                break;
            } else if ("1".equals(inp)) {
                transpomd(scanner);
                islo = false;
                break;
            } else if ("2".equals(inp)) {
                transposd(scanner);
                islo = false;
                break;
            } else if ("3".equals(inp)) {
                transpovl(scanner);
                islo = false;
                break;
            } else if ("4".equals(inp)) {
                transpohl(scanner);
                islo = false;
                break;
            }
        }
    }
    
    public static void addmat(Scanner scanner) {
        System.out.print("Enter size of first matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.println("Enter first matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter size of second matrix: ");
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Enter second matrix:");
        double[][] mat2 = new double[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                mat2[i][j] = scanner.nextDouble();
            }
        }
        if (n1 == n2 && m1 == m2) {
            System.out.println("The result is:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(mat1[i][j] + mat2[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }
    
    public static void cmultmat(Scanner scanner) {
        System.out.print("Enter size of matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter constant: ");
        double mult = scanner.nextDouble();
        System.out.println("The result is:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(mat1[i][j] * mult + " ");
            }
            System.out.println();
        }
    }
    
    public static void multmat(Scanner scanner) {
        System.out.print("Enter size of first matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.println("Enter first matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter size of second matrix: ");
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Enter second matrix:");
        double[][] mat2 = new double[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                mat2[i][j] = scanner.nextDouble();
            }
        }
        if (n1 == m2) {
            System.out.println("The result is:");
            double sum = 0;
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    sum = 0;
                    for(int ii = 0; ii < n1; ii++) {
                        sum += mat1[i][ii] * mat2[ii][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
        
    }
    
    public static void transpomd(Scanner scanner) {
        System.out.print("Enter size of matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result is:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(mat1[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void transposd(Scanner scanner) {
        System.out.print("Enter size of matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result is:");
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = m1 - 1; j >= 0; j--) {
                System.out.print(mat1[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void transpovl(Scanner scanner) {
        System.out.print("Enter size of matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result is:");
        for (int i = 0; i < m1; i++) {
            for (int j = n1 - 1; j >= 0; j--) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void transpohl(Scanner scanner) {
        System.out.print("Enter size of matrix: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result is:");
        for (int i = m1 - 1; i >= 0; i--) {
            for (int j = 0; j < n1; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void determin(Scanner scanner) {
        System.out.print("Enter matrix size: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result is:");
        System.out.println(deter(mat1));
    }
    
    public static double deter(double[][] matrix1) {
        if (matrix1.length == 2) {
            return matrix1[0][0] * matrix1[1][1] - matrix1[0][1] * matrix1[1][0];
        } else if (matrix1.length == 1) {
            return matrix1[0][0];
        } else {
            double d = 0;
            int sign = 1;
            for (int i = 0; i < matrix1.length; i++) {
                double[][] matrix2 = new double[matrix1.length -1][matrix1.length - 1];
                for (int j = 1; j < matrix1.length; j++) {
                    int p = 0;
                    for (int k = 0; k < matrix1.length; k++) {
                        p = k;
                        if (k == i) {
                            continue;
                        } else if (k > i) {
                            p = k - 1;
                        }
                        matrix2[j - 1][p] = matrix1[j][k];
                    }
                }
                d += matrix1[0][i] * sign * deter(matrix2);
                sign = - sign;
            }
            return d;
        }
    }
    
    public static void inversin(Scanner scanner) {
        System.out.print("Enter matrix size: ");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.print("Enter matrix:");
        double[][] mat1 = new double[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }
        }
        double det = deter(mat1);
        if (det == 0) {
            System.out.println("This matrix doesn't have an inverse.");
        } else {
            double[][] mat2 = adj(mat1);
            double adet = 1 / det;
            System.out.println("The result is:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(mat2[i][j] * adet + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static double[][] adj(double[][] matrix1) {
        double[][] matrixa = new double[matrix1[0].length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                double[][] matrix2 = new double[matrix1[0].length -1][matrix1.length - 1];
                for (int k = 0; k < matrix1.length; k++) {
                    for (int l = 0; l < matrix1[0].length; l++) {
                        int g = k;
                        int h = l;
                        if (k == i) {
                            continue;
                        }
                        if (l == j) {
                            continue;
                        }
                        if (k > i) {
                            g = k - 1;
                        }
                        if (l > j) {
                            h = l - 1;
                        }
                        matrix2[g][h] = matrix1[k][l];
                    }
                }
                matrixa[i][j] = Math.pow(-1, i + j) * deter(matrix2);
            }
        }
        double[][] matrixr = new double[matrix1[0].length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrixr[j][i] = matrixa[i][j];
            }
        }
        return matrixr;
    }
}
