//! Arrays

// let car = new Object();
// car["make"] = "Audi";
// car["model"] = "A5";
// car["carReg"] = "W8M8";

//a lot simpler and quicker to declare objects

// let car = { make: "Audi", model: "A5", carReg: "W8M8" };

// console.log(car) // shows all attributes
// console.log(car.make); //show the value of make
// console.log(car.model); //show the value of model
// console.log(car.carReg); //show the value of carReg

// //The object can have new properties added at any time. Known as an expando property.

// car.numberOfDoors = 4;
// console.log(car.numberOfDoors); //Shows the value referring to number of doors.

// let carPark = [
//     { make: "Audi", model: "A5", carReg: "AB12CDE" },
//     { make: "hyundai", model: "i30", carReg: "AB11CDE" }
// ]
// console.log(carPark);

// loop through
// for (let i = 0; i < carPark.length; i++) {
//     for (let key in carPark[i]) {
//         console.log(`${key} : ${carPark[i][key]}`);
   // }
// }
// or
// for(let obj in carPark){
//     for(let key in carPark[obj]){
//         console.log(`${key}: ${carPark[obj][key]}`)
//     }
// }

//! Arrays
// let a = Array(); // an empty array called a
// let b = Array(10); //array containing 10 empty spaces called b
// let c = Array("Tom","Dick","Harry"); // array containing 3 elements called c
// // short hand for creating arrays
// let cShortHand = ["Tom","Dick","Harry"]; //shorthand using [] around each elment and seperated by a comma.
// let d = [1,2,3,4,5];
// console.log(a);
// console.log(b);
// console.log(c);
// console.log(cShortHand);
// console.log(d);

// let classRoom = ["","","",""];
// classRoom[0] = "John";
// classRoom[3] = "Simran";

// console.log(classRoom[0]); // will return John
// console.log(classRoom[2]); // will return undefined
// console.log(classRoom[3]); // will return Simran.

// for (let i = 0; i < classRoom.length; i++) {
//     console.log(classRoom[i]);
// }
//or

// for(let person of classRoom){
//     console.log(person);
// }

// let d =["apple","strawberries","banana", "grapes", "pear"];

// console.log(d); // ["apple", "strawberries", "banana", "grapes", "pear"]
// console.log(d.sort()); // ["apple", "banana", "grapes", "pear", "strawberries"]
// console.log(d.reverse());//["strawberries", "pear", "grapes", "banana", "apple"]
// console.log(d.join()); //strawberries,pear,grapes,banana,apple

// e = d.join("-");
// console.log(e);// strawberries-pear-grapes-banana-apple

// console.log(d.push("lemon"));
// console.log(d);//["strawberries", "pear", "grapes", "banana", "apple", "lemon"]
// console.log(d.pop());
// console.log(d);//["strawberries", "pear", "grapes", "banana", "apple"]

// console.log(d.unshift("kiwi"));
// console.log(d); //["kiwi", "strawberries", "pear", "grapes", "banana", "apple"]
// console.log(d.shift());
// console.log(d); //["strawberries", "pear", "grapes", "banana", "apple"]

// let myArray = [1,2,3,4]; //declare an array
// //create a temp variable called "eachElement"
// //iterate though "myArray" starting at index 0
// //finally log the value of "eachElement"
// for (let eachElement of myArray) {
//     console.log(eachElement);
//  }

// let cars = [
//     { make: "Audi", model: "A5", carReg: "AB12CDE" },
//     { make: "BMW", model: "X5", carReg: "AB11CDE" }
// ]

// let jsonObj = {
//     "cars": [
//         {
//             "make": "Audi",
//             "model": "A5",
//             "carReg": "AB12CDE"
//         },
//         {
//             "make": "BMW",
//             "model": "X5",
//             "carReg": "AB11CDE"
//         }
//     ]
// };
// console.log(jsonObj.cars);
// console.log(jsonObj);

// The parse method takes a string and parses it into JavaScript objects
// let obj = JSON.parse('{"name":"Adrian"}');
// console.log(obj.name); //returns Adrian
// //The stringify method takes JavaScript objects and returns a string
// let str = JSON.stringify({ name: "John" });

// let myScript = function () { 
//     // insert fantastic code
// }

// // Later on... 
// myScript(); 

// (function(){
//     /*
//     *
//     * Variables 
//     *
//     */

//     let element = document.querySelector('#app');

//     /*
//     *
//     * Methods 
//     *
//     */
//     let handleClicks = function(event){
//         console.log(event.target);
//    }

//     /*
//     *
//     * Inits & Event Listeners 
//     *
//     */

//     element.addEventListener('click',handleClicks);
// })();


//! Destructuring
// spread operator
// const myArray =  [1,2,3,4,5,6,7,8,9,];
// const [a,b,...rest] = myArray;
// console.log(a); //1
// console.log(b); //2
// console.log(rest); //3,4,5,6,7,8,9

// skipping values
// const myArray =  [1,2,3,4,5,6,7,8,9,];
// const [a,,c,...rest] = myArray;
// console.log(a); //1
// console.log(c); //3
// console.log(rest); //,4,5,6,7,8,9

// objects
// const person = {
//    first: 'Chris',
//    last: 'Perrins',
//    country: 'UK',
//    city: 'Manchester',
//  };
//  let {first, last} = person;
//  console.log( `My name is ${first} ${last}`);
//  //output: My name is Chris Perrins

// Default values for Objects
// const person = {
//    first: 'Chris',
//    last: 'Perrins',
//    country: 'UK',
//    city: 'Manchester',
//  };
//  let {first, last,gender="Female"} = person;
//  console.log( `My name is ${first} ${last} and I am a ${gender}!`);
 //output: "My name is Chris Perrins and I am a Female!"

// const person = {
//    first: 'Chris',
//    last: 'perrins',
//    country: 'UK',
//    city: 'Manchester',
//    gender:'Male'
//  };
//  let { first,last, gender="Female" } = person;
//  console.log( `my name is ${first} ${last} and i am a ${gender}!`);
//  //output: "My name is Chris perrins and i am a Male!"

// const rgb = [200];
// const [red = 255, green, blue = 255] = rgb;
// console.log(`R: ${red}, G: ${green}, B: ${blue}`);
// //output:  R: 200, G: undefined, B: 255

// let red = 100;
// let green = 200;
// let blue = 50;
// const rgb = [200, 255, 100];
// [red, green] = rgb;
// console.log(`R: ${red}, G: ${green}, B: ${blue}`);
// //output: R: 200, G: 255, B: 50

// const student = {
//    name: 'John Doe',
//    age: 16,
//    scores: {maths: 74,english: 63}
// };
// const { name, scores: {maths, science = 50} } = student;

// console.log(`${name} scored ${maths} in Maths and ${science} in Science.`);
//output: John Doe scored 74 in Maths and 50 in Science.

//! Nested Array destructuring
// const color = ['#FF00FF', [255, 0, 255], 'rgb(255, 0, 255)'];
// // Use nested destructuring to assign red, green and blue
// const [hex, [red, green, blue]] = color;
// console.log(hex, red, green, blue);
// //output: #FF00FF 255 0 255

//! Swapping values
// let width = 300;
// let height = 400;
// const landscape = true;

// console.log(`${width} x ${height}`);
// //output :300 x 400
// if (landscape) {
//     // Swap the variables
//     [width, height] = [height, width];
//     console.log(`${width} x ${height}`);
//     //output: 400 x 300
// }

// const person = {
//    name: 'Isaac Mewton',
//    country: 'UK'
// };
// // Assign default value of 25 to years if age key is undefined
// const { name: fullname, country: place, age: years = 25 } = person;

// // Here I am using ES6 template literals
// console.log(`I am ${fullname} from ${place} and I am ${years} years old.`);
// //output: I am Isaac Mewton from UK and I am 25 years old.'

// //! Functions
// let x = myFunc(4, 3);
// // myFunc is called with two parameters, the return value will end up in x

// function myFunc(a, b) {
//   return a * b;
// // myFunc returns the sum of a and b
// }
// console.log(x);
// //Will give an output of 12.

// const getRectArea = function(width, height) {
//    return width * height;
//  };
 
//  console.log(getRectArea(3, 4));
//  // Output is 12

// sayHi("John"); // Hello, John
// function sayHi(name) {
//   alert( `Hello, ${name}` );
// }

// hello = () => "Hello World!";
// console.log(hello);
// hello = (name, age) => "Hello " + name +"! You are "+ age +" years old!";
// console.log(hello("Will", 34));
// hello = name => "Hello " + name;
// console.log(hello ("Will"));


// let test = "string";
// console.log(test)
// console.log(check);
// var check; 
// check = "string";
// console.log(check);
// console.log(test)

// addup = (in1, in2) => in1 + in2;
// console.log(addup(3,9));

