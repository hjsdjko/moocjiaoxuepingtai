const base = {
    get() {
                return {
            url : "http://localhost:8080/moocjiaoxuepingtai/",
            name: "moocjiaoxuepingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/moocjiaoxuepingtai/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "mooc 教学平台"
        } 
    }
}
export default base
