import React from 'react';
import { ItemContainer } from '@terminus/nusi-engine';
import Table from 'rc-table';

import './index.less'

type IProps = {}

const columns = [
  {
    title: 'Name',
    dataIndex: 'name',
    key: 'name',
    width: 100,
  },
  {
    title: 'Age',
    dataIndex: 'age',
    key: 'age',
    width: 100,
  },
  {
    title: 'Address',
    dataIndex: 'address',
    key: 'address',
    width: 200,
  },
  {
    title: 'Operations',
    dataIndex: '',
    key: 'operations',
    render: () => <a href="#">Delete</a>,
  },
];

const data = [
  { name: 'Jack', age: 28, address: 'some where', key: '1' },
  { name: 'Rose', age: 36, address: 'some where', key: '2' },
];


export default class extends ItemContainer<IProps> {
  render() {
    return <div>
      <p>HContainer</p>
      <Table columns={columns} data={data} />
    </div>
  }
}