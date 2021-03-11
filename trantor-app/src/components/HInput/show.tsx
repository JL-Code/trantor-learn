import React from 'react';
import { IRenderShowProps } from '@terminus/nusi-engine';

// TS 类型声明
type IProps = IRenderShowProps & {
  value: any;
}

export default class extends React.Component<IProps>{
  render() {
    const { value } = this.props;
    return <p>{value}</p>
  }
}