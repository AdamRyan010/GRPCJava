// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface SocketOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.SocketOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The full name of the socket option.  Typically this will be the upper case
   * name, such as "SO_REUSEPORT".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The full name of the socket option.  Typically this will be the upper case
   * name, such as "SO_REUSEPORT".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The human readable value of this socket option.  At least one of value or
   * additional will be set.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The human readable value of this socket option.  At least one of value or
   * additional will be set.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  boolean hasAdditional();
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  com.google.protobuf.Any getAdditional();
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  com.google.protobuf.AnyOrBuilder getAdditionalOrBuilder();
}
