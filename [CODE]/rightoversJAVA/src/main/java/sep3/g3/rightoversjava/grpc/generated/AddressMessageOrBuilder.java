// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package sep3.g3.rightoversjava.grpc.generated;

public interface AddressMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sep3.g3.AddressMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 address_id = 1;</code>
   * @return The addressId.
   */
  int getAddressId();

  /**
   * <code>string street = 2;</code>
   * @return The street.
   */
  java.lang.String getStreet();
  /**
   * <code>string street = 2;</code>
   * @return The bytes for street.
   */
  com.google.protobuf.ByteString
      getStreetBytes();

  /**
   * <code>string street_number = 3;</code>
   * @return The streetNumber.
   */
  java.lang.String getStreetNumber();
  /**
   * <code>string street_number = 3;</code>
   * @return The bytes for streetNumber.
   */
  com.google.protobuf.ByteString
      getStreetNumberBytes();

  /**
   * <code>int32 post_code = 4;</code>
   * @return The postCode.
   */
  int getPostCode();

  /**
   * <code>string city = 5;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 5;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>double longitude = 6;</code>
   * @return The longitude.
   */
  double getLongitude();

  /**
   * <code>double latitude = 7;</code>
   * @return The latitude.
   */
  double getLatitude();
}
