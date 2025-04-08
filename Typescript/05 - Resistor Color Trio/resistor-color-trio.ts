export const COLORS = [
    'black', 'brown', 'red', 'orange', 'yellow',
    'green', 'blue', 'violet', 'grey', 'white'
  ];
  
  export function resistorLabel(color1: string, color2: string, color3: string): string {
    const digit1 = COLORS.indexOf(color1.toLowerCase());
    const digit2 = COLORS.indexOf(color2.toLowerCase());
    const multiplier = COLORS.indexOf(color3.toLowerCase());
  
    const baseValue = parseInt(`${digit1}${digit2}`) * Math.pow(10, multiplier);
  
    if (baseValue >= 1000 && baseValue % 1000 === 0) {
      return `${baseValue / 1000} kiloohms`;
    } else {
      return `${baseValue} ohms`;
    }
  }
  