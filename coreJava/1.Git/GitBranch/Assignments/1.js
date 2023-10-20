//JavaScript program to swap two variables

//take input from the users
let a = prompt('Enter the first variable: ');
let b = prompt('Enter the second variable: ');

//create a temporary variable
let temp;
let happy; //changes made

//swap variables
temp = a;
a = b;
b = temp;
happy = 12; // changes made

console.log(`The value of a after swapping: ${a}`);
console.log(`The value of b after swapping: ${b}`);
