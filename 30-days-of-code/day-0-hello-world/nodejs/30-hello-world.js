_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
process.stdin.resume();
process.stdin.setEncoding("ascii");
function processData(inputString) {
    console.log("Hello, World.");
    console.log(inputString);
} 
