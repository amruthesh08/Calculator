let display = document.getElementById('display');
let buttons = document.querySelectorAll('.btn');
let clearButton = document.getElementById('clear');
let equalButton = document.getElementById('equal');
let currentInput = '';
let currentOperation = '';

buttons.forEach(button => {
  button.addEventListener('click', (e) => {
    let value = e.target.getAttribute('data-value');
    
    if (value) {
      if (currentInput === '0' && value !== '.') {
        currentInput = value;
      } else {
        currentInput += value;
      }
      display.innerText = currentInput;
    }
  });
});

equalButton.addEventListener('click', () => {
  try {
    currentInput = eval(currentInput);
    display.innerText = currentInput;
  } catch (error) {
    display.innerText = 'Error';
  }
});

clearButton.addEventListener('click', () => {
  currentInput = '0';
  display.innerText = currentInput;
});
