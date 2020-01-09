# 装饰着模式（Decorator）
##  当一个主体可以与多个附体（装饰）多样组合。
###  
### Component: 一个主体的抽象类，ConcreteComponent: 主体的各种实现,继承主体Component
### Decorator：多种装饰者（附体）的父类，继承主体Component，包含一个主体对象（Component Obj）;
### 咖啡案例
### 多品种咖啡，多种配料，一种咖啡可以搭配多种配料
### 
