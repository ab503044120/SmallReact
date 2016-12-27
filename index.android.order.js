
import React, { Component } from 'react';
import { AppRegistry, Text, View } from 'react-native';
import  FlexDimensionsBasics from './test/FlexDimensionsBasics'
import  MyScene from './MyScene'
import AlignItemsBasics from './test/FlexDimensionsBasics'
import ListViewBasics from './test/ListViewBasics'

class Blink extends React.Component {
 // 初始化模拟数据
  constructor(props) {
    super(props);
    this.state = { showText: true };

    // 每1000毫秒对showText状态做一次取反操作
    setInterval(() => {
      this.setState({ showText: !this.state.showText });
    }, 1000);
  }

  render() {
    // 根据当前showText的值决定是否显示text内容
    let display = this.state.showText ? this.props.text : ' ';
    return (
      <Text>{display}</Text>
    );
  }
}


class HelloReact extends Component {
    constructor(props) {
      super(props);
      this.state = { foucsView:  {FlexDimensionsBasics} };
    }

  render() {
    return (
      <View style={{ height: 200 }} >
       <AlignItemsBasics />
        <Text>First part and </Text>
        <Blink text='I am order !' />
      </View>
    );
  }
}

AppRegistry.registerComponent('HelloOrder', () => HelloReact);