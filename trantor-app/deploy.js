module.exports = {
  // 配置 同后端项目上传元数据的配置保持一致 详情参见 trantor.yml 和 trantor-metadata-maven-plugin 配置
  options: {
    NAME: 'Trantor前端资源模块',
    DEPLOY_URL: 'http://localhost:8082/terminus/mecode_trantor_poc', // 同后端项目保持一致
    MODULE_KEY: 'trantor_react_app', // 模块名称: 自定义名称 
    VERSION: '0.0.1-SNAPSHOT', // 模块版本: 自定义版本 同后端项目保持一致
    PRODUCT: {
      KEY: 'mecode_trantor_poc', // 与 projectKey 相同 同后端项目保持一致
      VERSION: '0.0.1-SNAPSHOT' // 目前定制项目的版本是固定的, 都是 0.0.0-SNAPSHOT 同后端项目保持一致
    },
  },

  // 发布前操作 Hook
  async before(){

  },

  // 发布后操作 Hook
  async after(){

  }
}
