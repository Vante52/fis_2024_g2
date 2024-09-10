/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      backgroundImage: {
        'login': "url('./src/assets/img.jpg')",
        'concert': "url('./src/assets/concert.jpg')"
      },
      colors: {
        // Añade más colores personalizados aquí
      },
    },
  },
  plugins: [],
}
