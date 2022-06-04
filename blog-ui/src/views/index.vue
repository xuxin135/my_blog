<template>
  <div class="height-full">
    <el-container>
      <el-header>
          <el-icon class="header-icon" size="44" color="#9f9a9a"><Bicycle /></el-icon>
          <span class="header-title">
               MY-BLOG 
          </span>
      </el-header>
      <el-container>
        <el-aside width="200px">
            <el-row class="tac">
                <el-col>
                <el-menu
                    active-text-color="#ffd04b"
                    background-color="#545c64"
                    class="el-menu-vertical-demo"
                    :default-active="this.$router.path"
                    text-color="#fff"
                    unique-opened 
                    router
                    @open="handleOpen"
                    @close="handleClose"
                >
                    <el-menu-item index="/index">
                        <el-icon><icon-menu /></el-icon>
                        <span>首页</span>
                    </el-menu-item>
                    <el-submenu index="2">
                        <template #title>
                            <el-icon><location /></el-icon>
                            <span>系统管理</span>
                        </template>
                        <el-menu-item index="/system/users">用户管理</el-menu-item>
                        <el-menu-item index="/system/roles">角色管理</el-menu-item>
                        <el-menu-item index="/system/menus">菜单管理</el-menu-item>
                        <el-menu-item index="/system/configs">参数设置</el-menu-item>
                    </el-submenu>
                    <el-menu-item index="/blogs">
                    <el-icon><icon-menu /></el-icon>
                    <span>博客管理</span>
                    </el-menu-item>
                    <el-submenu index="4">
                        <template #title>
                            <el-icon><location /></el-icon>
                            <span>系统监控</span>
                        </template>
                        <el-menu-item index="/monitor/onlines">在线用户</el-menu-item>
                        <el-menu-item index="/monitor/serves">服务监控</el-menu-item>
                        <el-menu-item index="/monitor/cache">缓存监控</el-menu-item>
                    </el-submenu>
                </el-menu>
                </el-col>
            </el-row>
        </el-aside>
        <el-container>
          <el-main>
              <router-view></router-view>
          </el-main>
          <el-footer>Footer</el-footer>
        </el-container>
      </el-container>
    </el-container>
  </div>
</template>


<script lang="ts" setup>
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
  MoreFilled,Bicycle,
} from '@element-plus/icons-vue'
const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const activities = [
  {
    content: 'Custom icon',
    timestamp: '2018-04-12 20:46',
    size: 'large',
    type: 'primary',
    icon: MoreFilled,
  },
  {
    content: 'Custom color',
    timestamp: '2018-04-03 20:46',
    color: '#0bbd87',
  },
  {
    content: 'Custom size',
    timestamp: '2018-04-03 20:46',
    size: 'large',
  },
  {
    content: 'Custom hollow',
    timestamp: '2018-04-03 20:46',
    type: 'primary',
    hollow: true,
  },
  {
    content: 'Default node',
    timestamp: '2018-04-03 20:46',
  },
]
</script>

<style>
.el-header {
    background-color: #212527
}
.header-icon {
    top: 7px
}
.header-title {
    color: #a1b7da;
    font-size: 35px;
}
.height-full,
.el-container,
.el-aside,
.el-row,
.el-col,
.el-menu {
    height: 100%
}
.el-aside {
    overflow: hidden
}
.el-footer {
    background-color: #e2dede
}
</style>
