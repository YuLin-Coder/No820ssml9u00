const base = {
    get() {
                return {
            url : "http://localhost:8080/ssml9u00/",
            name: "ssml9u00",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssml9u00/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "网络教学平台"
        } 
    }
}
export default base
