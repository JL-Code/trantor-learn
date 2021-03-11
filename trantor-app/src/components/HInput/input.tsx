import React from 'react';
import { IRenderInputProps } from '@terminus/nusi-engine';
import { Input } from '@terminus/nusi';

// TS 类型声明
type IProps = IRenderInputProps & {
  value: any;
  onChange: (v: any) => void
}

/**
 * 测试 XML 
 * <Fields>
            <Field name="name" label="用户名"/>
            <Field name="email" label="邮箱"/>
            <Field name="phone" label="手机"/>
            <Field name="birthday" label="生日" initValue="121212">
                <RenderType>
                    <HInput.input/>
                </RenderType>
            </Field>
        </Fields>
 */

export default class extends React.Component<IProps>{
  render() {
    const { value, onChange } = this.props;
    return <Input defaultValue={value} onChange={e => onChange(e.target.value)} />
  }
}

