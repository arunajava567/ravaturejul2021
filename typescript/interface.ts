interface IPerson {
    name: string;
    display():void;
}

interface IEmployee {
    empCode: number;
}

class Employee2 implements IPerson, IEmployee {
    empCode: number;
    name: string;
    
    constructor(empcode: number, name:string) {
        this.empCode = empcode;
        this.name = name;
    }
    
    display(): void {
        console.log("Name = " + this.name +  ", Employee Code = " + this.empCode);
    }
}

let per1:IPerson = new Employee2(100, "Bill");
per1.display(); // Name = Bill, Employee Code = 100

let emp1:IEmployee = new Employee2(100, "Bill");
//emp1.display(); //Compiler Error: Property 'display' does not exist on type 'IEmployee'
