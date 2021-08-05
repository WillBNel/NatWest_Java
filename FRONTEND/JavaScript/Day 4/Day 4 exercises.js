//! DOM
// let div = document.querySelector(`.main`);
// const header = document.createElement(`h1`);
// const p = document.createElement(`p`);
// const button = document.createElement(`button`);

// div.appendChild(header);
// div.appendChild(p);
// div.appendChild(button);

// header.innerText =`Story`;
// p.innerText = `More about the story`;
// button.innerText = `Click Me`;

// header.setAttribute(`class`, `mainHeader`);

// header.addEventListener(`click`, () => {
//     header.style.color  === `black` ? (header.style.color = `red`) : (header.style.color = `black`)
// });

// function addParagraph() {
//     const para1 = document.createElement(`p`);

//     div.appendChild(para1);

//     para1.innerText = "I'm a paragraph";
// }

// button.addEventListener(`click`, addParagraph);





// let div = document.querySelector(`.main`);
// const header = document.createElement(`h1`);
// const p = document.createElement(`p`);
// const button = document.createElement(`button`);

// div.appendChild(header);
// div.appendChild(p);
// div.appendChild(button);

// header.innerText =`Story`;
// p.innerText = `More about the story`;
// button.innerText = `Click Me`;

// button.addEventListener(`click`, );

//! API Fetch Data

let div = document.querySelector(`.main`);

const header = document.createElement(`h4`);
const p = document.createElement(`p`);
const id = document.createElement(`id`);

div.appendChild(header);
div.appendChild(p);
div.appendChild(id);
header.innerText =`Data, Function, Data, Repeat`;
p.innerText = `Here we go again....`;

header.setAttribute(`class`, `mainHeader`);

header.addEventListener(`click`, () => {
    header.style.color  === `black` ? (header.style.color = `red`) : (header.style.color = `black`)
});

//! Exercise 1
//     fetch('https://reqres.in/api/users?page=2')
//     .then((response) => {
//     if (response.status !== 200) {
//         console.log(`Looks like there was a problem.Status Code: ${ response.status }`);
//         return;
//     }
// response.json()
// .then(data => console.log(data));         
// })
// .catch(err => console.error(`Fetch Error :-S ${err}`));

//! Exercise 2
// fetch('https://reqres.in/api/users/2')
// .then((response) => {
//     if (response.status !== 200) {
//         console.log(`Looks like there was a problem.Status Code: ${ response.status }`);
//         return;
//     }
// response.json()
// .then(data => console.log(data));         
// })
// .catch(err => console.error(`Fetch Error :-S ${err}`));

//! Exercise 3
// fetch("https://reqres.in/api/users", {
//     method: 'post',
//     headers: {
//         "Content-type": "application/json"
//     },
//     body: JSON.stringify({
//        name: "Morpheus",
//        job: "Leader"
//       })
//     })
//     .then(res => res.json())
//     .then(data => console.log(`Request succeeded with JSON response ${data}`))
//     .catch(error => console.error(`Request failed ${error}`));

//! Exercise 4
// fetch("https://reqres.in/api/register", {
//     method: 'post',
//     headers: {
//         "Content-type": "application/json"
//     },
//     body: JSON.stringify({
//         email: "eve.holt@reqres.in",
//         password: "pistol"
//       })
//     })
//     .then(res => res.json())
//     .then(data => console.log(`Request succeeded with JSON response ${data}`))
//     .catch(error => console.error(`Request failed ${error}`));

//! Exercise 5
// fetch("https://reqres.in/api/login", {
//     method: 'post',
//     headers: {
//       "Content-type": "application/json"
//     },
//     body: JSON.stringify({
//         email: "eve.holt@reqres.in",
//         password: "cityslicka"
//       })
//   })
//   .then(res => res.json())
//   .then(data => console.log(`Request succeeded with JSON response ${data}`))
//   .catch(error => console.error(`Request failed ${error}`));

//! Use this!!!!!
// function fetchData() {
 
//     fetch("https://reqres.in/api/users?page=2")
//         .then(response => {
//             if (!response.ok) {
//                 throw Error("Error");
//             }
//             return response.json();
//         })
//         .then(data => {
//             console.log(data.data);
//             const html = data.data
//                 .map(user => {
//                     return `<p>Email: ${user.email}</p>`;
//                 })
//                 .join("");
//             console.log(html);
//             document.querySelector("#app").insertAdjacentHTML("afterbegin", html);
//         })
//         .catch(error => {
//             console / log(error);
//         })
// }
 
// fetchData();
