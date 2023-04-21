package com.wlper.temp.jdk.function;

@FunctionalInterface
interface Converter<F, T> {
 T convert(F from);
}