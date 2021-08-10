class Employee{
    ename:string ;
    contact:string;
    constructor(ename:string,contact:string) {
        this.ename=ename;
        this.contact=contact;
    }
    dispEmpDetails():void    //behaviour or function
    {
    console.log("Ename:"+this.ename+"  Contact:"+this.contact);
   }
}



var e =new Employee("ram","987867");
e.dispEmpDetails();
/*
//default parameter
function Greet(greeting: string = "Hello", name1: string) : void {
    return console.log(greeting + ' ' + name1 + '!');
}

Greet("Good Evening","Ram");
Greet("Ram");

*/