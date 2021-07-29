(function(){ console.log("Look at me, I'm running");
}
)

();

function funcTwo(y, callback) {
    callback(y);	
  //  callback(y);	
}

funcTwo(10, function(x) 
            { console.log("x = " + x); 
            }

)
//closure

function greeting() {
    var message = 'Hi';

    function sayHi() {
        console.log(message);
    }

    sayHi();

}
 greeting();
