// let A = 100;
// 
// while (A <= 200) {
//     A++
//     console.log(`A ${A}`);
// }

// let A = 10;
// while (A <= 20) {
//   if (A%2 == 0) {
//     console.log(`-`);
//   } else {
//     console.log(`*`);
//   }
//   A++;
// }

// for (let i = 0; i < 10; i++) {
//     for (let j = 1; j <= 10; j++) {
//       console.log(j);
//     }
//  } 

// for (let A = 100; A <= 200; A++) {
//     console.log(`A = ${A}`);
// }

    // for (let A = 10; A <= 20; A++) {
    //     if (A % 2 == 0){
    //         console.log(`-`);
    //     } else {
    //         console.log(`*`);
    //     }
    // }

let now = new Date(); 
let day = now.getDay();
switch (day) {
  case 0:
    console.log(`It's Sunday`);
    break;
  case 6:
    console.log(`It's Saturday`);
    break;
  case 1:
    console.log(`It's Monday`);
  case 2:
      console.log(`It's Tuesday`);
      break;
  case 3:
      console.log(`It's Wednesday`);
      break;
  case 4:
  case 5:
    console.log(`It's a weekday`);
    break;
  default:
    console.log(`Invalid day`);
    break;
}
