module.exports = {
  purge: [],
  darkMode: false, // or 'media' or 'class'
  theme: {
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
