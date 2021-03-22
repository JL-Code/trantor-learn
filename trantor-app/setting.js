const { dynamicExternals } = require('@terminus/t-tools-externals-lazy-pkgs');
const BundleAnalyzerPlugin = require('webpack-bundle-analyzer').BundleAnalyzerPlugin

module.exports = {

  // 打包存放目录
  dist: '../trantor-server/src/main/resources/trantor/resources/trantor_poc',
  // dist: './dist',
  // 开发配置
  dev: {
    port: 8001,
    browser: true
  },

  // 是否是 trantor 项目
  isTrantor: true,

  // 内部依赖
  externals: [
    'react',
    'react-dom',
    'moment',
    'lodash',
    'classnames',
    'classnames/bind',
    'mobx',
    'mobx-react',
    '@terminus/nusi',
    '@terminus/nusi-engine',
    '@terminus/i18n-plat-sdk-js'
  ],

  // 外部依赖(需要懒加载)
  dynamicExternals,

  // 本地扩展查找路径 false 不查找任何 node_module (禁止引入任何自定义第三方组件), 如果是string 自定义查找
  node_modules: true,

  // 打包工具 webpack | rollup
  tool: 'webpack',

  // 是否启用 cssmodule true | false
  cssmodule: true,

  // webpack 配置 false | Object | function
  webpackConfig(webpackConfig, webpackMerge, options) {
    // webpackConfig.module.rules.forEach(rule => {
    //   if (rule.use) {
    //     console.log("=====rule=====")
    //     console.log(rule)
    //     rule.use.forEach(u => {
    //       console.log("=====use=====")
    //       console.log(u)
    //     })
    //   }
    // });

    webpackConfig.plugins = []
    webpackConfig.plugins.push(
      new BundleAnalyzerPlugin({ analyzerPort: 3012 })
    )

    webpackConfig.module.rules.push({
      test: /\.css$/i,
      use: [
        { loader: 'style-loader' },
        {
          loader: 'css-loader', options: {
            import: (url, media, resourcePath) => {
              return true;
            }
          }
        }
      ]
    });
    return webpackConfig;
  }
}
