abstract class Person {
    name: any;
    
    constructor(name: string) {
        this.name = name;
    }

    display(): void{
        console.log(this.name);
    }

    abstract find(string): Person;
}

class Employee1 extends Person { 
    empCode: number;
    
    constructor(name: string, code: number) { 
        super(name); // must call super()
        this.empCode = code;
    }

    find(name:string): Person { 
        // execute AJAX request to find an employee from a db
        return new Employee1(name, 99);
    }
}

let emp: Person = new Employee1("James", 100);
emp.display(); //James
console.log(emp.find("James"));
//arrow function
let sumnumbers = (x: number, y: number): number   => {
 return x+y;
}

//ananymous function
let sumnumbers1 = function(x: number, y: number): number   {
    return x+y;
   }
//named function
function sumnumber2(x: number, y: number): number   {
    return x+y;
   }  
console.log(sumnumbers(4,5));
