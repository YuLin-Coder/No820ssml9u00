import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import qiandaoqingkuang from '@/views/modules/qiandaoqingkuang/list'
    import examquestion from '@/views/modules/examquestion/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import jiaoxueziyuan from '@/views/modules/jiaoxueziyuan/list'
    import storeup from '@/views/modules/storeup/list'
    import exampaper from '@/views/modules/exampaper/list'
    import ketangxinxi from '@/views/modules/ketangxinxi/list'
    import exampaperlist from '@/views/modules/exampaperlist/list'
    import messages from '@/views/modules/messages/list'
    import ketangjiaru from '@/views/modules/ketangjiaru/list'
    import discussqiandaoxinxi from '@/views/modules/discussqiandaoxinxi/list'
    import qiandaoxinxi from '@/views/modules/qiandaoxinxi/list'
    import discussjiaoxueziyuan from '@/views/modules/discussjiaoxueziyuan/list'
    import examrecord from '@/views/modules/examrecord/list'
    import discussketangxinxi from '@/views/modules/discussketangxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/qiandaoqingkuang',
        name: '签到情况',
        component: qiandaoqingkuang
      }
          ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
          ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
          ,{
	path: '/jiaoxueziyuan',
        name: '教学资源',
        component: jiaoxueziyuan
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/exampaper',
        name: '试卷管理',
        component: exampaper
      }
          ,{
	path: '/ketangxinxi',
        name: '课堂信息',
        component: ketangxinxi
      }
          ,{
	path: '/exampaperlist',
        name: '试卷列表',
        component: exampaperlist
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/ketangjiaru',
        name: '课堂加入',
        component: ketangjiaru
      }
          ,{
	path: '/discussqiandaoxinxi',
        name: '签到信息评论',
        component: discussqiandaoxinxi
      }
          ,{
	path: '/qiandaoxinxi',
        name: '签到信息',
        component: qiandaoxinxi
      }
          ,{
	path: '/discussjiaoxueziyuan',
        name: '教学资源评论',
        component: discussjiaoxueziyuan
      }
          ,{
	path: '/examrecord',
        name: '考试记录',
        component: examrecord
      }
          ,{
	path: '/discussketangxinxi',
        name: '课堂信息评论',
        component: discussketangxinxi
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
