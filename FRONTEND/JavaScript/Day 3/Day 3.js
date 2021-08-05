//!
// let hello = "Billy Bob Joe";
// function someFunction() {
    
//   }
//   someFunction();
//   console.log(hello); 

// let check = false;

// function changeCheck() {
//   check = true;
// }
// changeCheck();
// console.log(check); // True

//! Scope example 1
// function test() {
//     flag = true;
//     alert(flag);
//     test1();
//     alert(flag);
//   }
//   function test1() {
//     flag = false;
//     return;
//   }

//! Scope example 2
// function test() {
//     flag = true;
//     alert(flag);
//     test1();
//     alert(flag);
//   }
//   function test1() {
//     let flag = false;
//     return;
//   }

// alert("Hello")
// alert("World")

// alert("All good now");
// [1,2].forEach(alert)

// console.log(' \'Woof\' - Sir Barks A Lot '); 

// const array1 = [1,2,3,4,5]; 
// let sum = array.reduce((a,b) => a+b);
// console.log();

//! Promises
    //   //we create a new promise
    //   let newProm = new Promise((resolve,reject)=>{
    //     let a = 1+0;
    //     if (a==2){
    //         //we say what happens in the success outcome
    //         resolve("Success");
    //     }else{
    //         //we say what happens in the reject outcome
    //         reject("Failed");
    //     }
    // })

    // //we then pass the value from resolve or reject and we set it to message.
    // //.then() is executed if Fulfilled/successful.
    // newProm.then((message)=>{
    //     console.log(`This is in the then block and the status is: ${message}`);
    //     //.catch() is executed if rejected/failed.
    // }).catch((message)=>{
    //     console.log(`This is in the catch block and the status is: ${message}`);
    // //.then can be chained and will execute regardless of the outcome.
    // }).then(()=>{
    //     console.log("I will take place regardless of what happened before.");
    // })

    // function newProm(msg) {
    //   return new Promise((resolve, reject) => {
    //       console.log(msg);

    //       let error = true;

    //       if(error) {
    //         resolve("Correct");  
    //       } else {
    //          reject("Incorrect") 
    //       }
    //   })
    // }

    // newProm("Hello").then((resolve) => console.log(resolve)).catch((reject) => console.log(reject)).then(() => console.log("Enjoy!"));

//! Callbacks
// const greeting = (name) =>  {

//     // Creates an alert(pop-up box) which says hello and appends the value of the variable `name`
//     alert(`Hello ${name}`);
//   }
  
//   const processUserInput = (callback) =>  {
  
//     // A simple user input box appears on the browser that take a value and assigns it to `name`
//     let name = prompt('Please enter your name.');
  
//     // Then pass the variable `name` to the callback function as parameter
//     callback(name);
//   }
//   //Call the function `processUserInput()` and then pass `greeting` as a parameter.
//   processUserInput(greeting);

//! Query parameters - Review in Community
// const params = new URLSearchParams(window.location.search);
// console.log(params.get("editors"));
// console.log(params.has("editors"));


//! Higher Order Functions 
//! First-Order Function
// const censor = words => {
//     const filtered = [];
//     for(let i = 0; i < words.length; i++) {
//         const word = words[i];
//         if(word.length !== 4) filtered.push(word);
//     }
//     console.log(filtered); 
// };

// censor(['zonk','army','shout','sun']);

// const startsWithS = words => {
//     const filtered = [];
//     for( let i = 0; i < words.length; i++ ) {
//         const word = words[i];
//         if(word.startsWith('s')) filtered.push(word);
//     }
//     console.log(filtered);
// };

// startsWithS(['zonk','army','shout','sun']);

//! Reducer function
//Return a sum of the array
// const arrayReduce = (reducer, initialVal, arr) =>{
//     //shared stuff
//     let sum = initialVal;
//     //1
//     //3
//     //6
//     //10
//     //15

//     for(let i=0; i<arr.length; i++) {
//         //unique stuff in reducer() call
//             //acc is the starting index // arr[i] is the current index
//         sum = reducer(sum, arr[i]);
//         // more shared stuff
//     }
//     return sum;
// }

// let reducer = (currentSummedValue, currentIndex) => currentSummedValue + currentIndex;

// console.log(arrayReduce(reducer, 0, [1,2,3,4,5]));
// // Output : 15

