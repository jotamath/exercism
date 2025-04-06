export const colorCode = (color: string): number => {
    const index = COLORS.indexOf(color.toLowerCase());
    if (index === -1) throw new Error('invalid color');
    return index;
}
  
  export const COLORS = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white'];
  