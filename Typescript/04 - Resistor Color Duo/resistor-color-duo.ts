export const COLORS = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white'];

export function decodedValue(colors: string[]): number{
   
        if (colors.length < 2) throw new Error('invalid color');
        const firstColor = COLORS.indexOf(colors[0].toLowerCase());
        const secondColor = COLORS.indexOf(colors[1].toLowerCase());
        if (firstColor === -1 || secondColor === -1) throw new Error('invalid color');
        return firstColor * 10 + secondColor;
    
  }
  