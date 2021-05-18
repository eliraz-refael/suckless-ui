const colors = require('tailwindcss/colors');

module.exports = {
  purge: [],
  darkMode: false, // or 'media' or 'class'
  theme: {
    colors: {
      transparent: 'transparent',
      current: 'currentColor',
      black: colors.black,
      blueGray: colors.blueGray,
      coolGray: colors.coolGray,
      warmGray: colors.warmGray,
      gray: colors.trueGray,
      emerald: colors.emerald,
      lime: colors.lime,
      fucshia: colors.fuchsia,
      white: colors.white,
      indigo: colors.indigo,
      rose: colors.rose,
      amber: colors.amber,
      yellow: colors.yellow,
    },
    ripple: theme => ({
      colors: theme('colors')
    }),
    extend: {},
  },
  variants: {
    extend: {
      backgroundColor: ['active'],
    },
  },
  plugins: [
    require('tailwindcss-ripple')()
  ],
}
