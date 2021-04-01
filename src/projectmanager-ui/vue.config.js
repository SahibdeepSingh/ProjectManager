module.exports = {
    devServer: {
    port: 9002,
    proxy: {
        '/api' : {
            target: 'http:localhost:8080',
            ws: true,
            changeOrigin: true
            }
        }
    }

}