//! Document Object Model (DOM)
// 1. querySelector()
// 2. querySelectorAll()
// 3. addEventListener()
// 4. createElement()
// 5. appendChild()
// 6. removeChild()
// 7. replaceChild()
// 8. setAttribute()
// 9. getAttribute()
// 10. removeAttribute()

//! Handling Events and Timed Events



//! Fetch API
// fetch(`https://jsonplaceholder.typicode.com/comments`) // 1
//     .then((response) => {
//         if (response.status !== 200) {  //  2
//             console.error(`status: ${reponse.status}`);
//             return;
//         }
//         response.json() // 3
//         .then(data => console.info(data)) // 4
//     }).catch((err)=> console.error(`${err}`)); // 5
// }

// fetch("http://www.someurl.com/users", { //1
//     method: 'post', //2
//     headers: {
//       "Content-type": "application/json" //3
//     },
//     body: JSON.stringify( //4
//       {
//         "name": "John doe",//5
//         "age": 5,
//         "gender": "Male"
//       }
//     )
//   })
//   .then(res => res.json())
//   .then((data) => console.log(`Request succeeded with JSON response ${data}`))
//   .catch((error) => console.log(`Request failed ${error}`))
//   });

//   let id = 1; //1
//       fetch("someURL/"+id, {  //2
//           method: 'delete'  //3
//         })
//         .then((data) => {
//           console.log(`Request succeeded with JSON response ${data}`);
//           // some function to execute if successful
//         })
//         .catch((error) => {
//           //some function to execute if error
//         });


