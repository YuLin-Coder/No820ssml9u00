
var projectName = '网络教学平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '课堂信息',
	url: './pages/ketangxinxi/list.html'
}, 
{
	name: '签到信息',
	url: './pages/qiandaoxinxi/list.html'
}, 
{
	name: '教学资源',
	url: './pages/jiaoxueziyuan/list.html'
}, 

{
	name: '试卷列表',
	url: './pages/exampaper/list.html'
}, 
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssml9u00/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["查看","删除"],"menu":"课堂信息","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"签到信息","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教学资源","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源管理"},{"child":[{"buttons":["查看","回复"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","加入"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","查看评论","签到"],"menu":"签到信息列表","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"教学资源列表","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","加入"],"menu":"课堂信息","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课堂加入","menuJump":"列表","tableName":"ketangjiaru"}],"menu":"课堂加入管理"},{"child":[{"buttons":["查看","签到"],"menu":"签到信息","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"签到情况","menuJump":"列表","tableName":"qiandaoqingkuang"}],"menu":"签到情况管理"},{"child":[{"buttons":["查看"],"menu":"教学资源","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看"],"menu":"考试记录","tableName":"examrecord"},{"buttons":["查看"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["查看"],"menu":"试卷列表","tableName":"exampaperlist"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","加入"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","查看评论","签到"],"menu":"签到信息列表","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"教学资源列表","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","新增","修改","删除"],"menu":"课堂信息","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"课堂加入","menuJump":"列表","tableName":"ketangjiaru"}],"menu":"课堂加入管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"签到信息","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"签到情况","menuJump":"列表","tableName":"qiandaoqingkuang"}],"menu":"签到情况管理"},{"child":[{"buttons":["查看"],"menu":"教学资源","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["查看","回复"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["新增","查看","修改","删除"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["新增","查看","修改","删除"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论","加入"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","查看评论","签到"],"menu":"签到信息列表","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"教学资源列表","menuJump":"列表","tableName":"jiaoxueziyuan"}],"menu":"教学资源模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
