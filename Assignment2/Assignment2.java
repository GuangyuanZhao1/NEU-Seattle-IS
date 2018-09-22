/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    		this.name = name;
    		this.age = age;
    		this.gender = gender;
    		this.salary = salary;
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    		String n = name;
    		return n;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    		this.name = name;
    }
    
    public void raiseSalary(double byPercent) {
    	double p = byPercent;
    	salary = salary*(1+p);
    	System.out.println(name + "'s salary is "+ salary);
    }

    
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        double s = employee.salary;
        double tax = 0;
        if (s<=8900) {
        	tax = s*0.062;
        	
        }
        else {
        	tax = 106800*0.062;
        }
        System.out.println(employee.name + "'s Social Security Tax is "+ tax);
    	return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        int age = employee.age;
        double s = employee.salary;
        double i = 0;
    	if (age < 35) {
    		i = 0.03*s;
    	}
    	else if (age>=35 && age<=50) {
    		i = 0.04*s;
    	}
    	else if (age>50 && age<=60) {
    		i = 0.05*s;
    	}
    	else {
    		i = 0.06*s;
    	}
    	System.out.println(employee.name + "'s contribution for insurance coverage is "+ i);
    	return i;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        double s1 = e1.salary;
        double s2 = e2.salary;
        double s3 = e3.salary;
        String n1 = e1.name;
        String n2 = e2.name;
        String n3 = e3.name;
        //double temp = 0.0;
        //String t;
        if (s1 <= s2 && s1 <= s3) {
        	if (s2 <= s3) {
        		System.out.println(n1+n2+n3);
        	}
        	else {
        		System.out.println(n1+n3+n2);
        	}
        }
        else if (s2 <= s1 && s2 <=s3) {
        	if (s1 <= s3) {
        		System.out.println(n2+n1+n3);
        	}
        	else {
        		System.out.println(n2+n3+n1);
        	}
        }
        else {
        	if (s1 <= s2) {
        		System.out.println(n3+n1+n2);
        	}
        	else {
        		System.out.println(n3+n2+n1);
        	}
        }
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        double s = employee.salary;
        s = s*3;
        System.out.println(employee.name + "'s salary is " + s);
    }
    
    

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     Because you just swap the formal parameter, and you don't swap the instance variable.
     The formal parameter is stored in stack, but the instance variable is stored in heap.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Employee c = new Employee("Tom", 60, Gender.MALE, 900);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        Assignment2 x = new Assignment2();
        x.socialSecurityTax(a);
        x.insuranceCoverage(b);
        x.sortSalary(a, b, c);
        x.tripleSalary(c);
        c.raiseSalary(0.3);
        
        
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}