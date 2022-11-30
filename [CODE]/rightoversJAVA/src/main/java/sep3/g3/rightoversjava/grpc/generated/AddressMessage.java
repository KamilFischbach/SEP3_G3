// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package sep3.g3.rightoversjava.grpc.generated;

/**
 * Protobuf type {@code sep3.g3.AddressMessage}
 */
public final class AddressMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sep3.g3.AddressMessage)
    AddressMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressMessage.newBuilder() to construct.
  private AddressMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressMessage() {
    street_ = "";
    streetNumber_ = "";
    city_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            addressId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            street_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            streetNumber_ = s;
            break;
          }
          case 32: {

            postCode_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
            break;
          }
          case 49: {

            longitude_ = input.readDouble();
            break;
          }
          case 57: {

            latitude_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_AddressMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_AddressMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.g3.rightoversjava.grpc.generated.AddressMessage.class, sep3.g3.rightoversjava.grpc.generated.AddressMessage.Builder.class);
  }

  public static final int ADDRESS_ID_FIELD_NUMBER = 1;
  private int addressId_;
  /**
   * <code>int32 address_id = 1;</code>
   * @return The addressId.
   */
  @java.lang.Override
  public int getAddressId() {
    return addressId_;
  }

  public static final int STREET_FIELD_NUMBER = 2;
  private volatile java.lang.Object street_;
  /**
   * <code>string street = 2;</code>
   * @return The street.
   */
  @java.lang.Override
  public java.lang.String getStreet() {
    java.lang.Object ref = street_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      street_ = s;
      return s;
    }
  }
  /**
   * <code>string street = 2;</code>
   * @return The bytes for street.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreetBytes() {
    java.lang.Object ref = street_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      street_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STREET_NUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object streetNumber_;
  /**
   * <code>string street_number = 3;</code>
   * @return The streetNumber.
   */
  @java.lang.Override
  public java.lang.String getStreetNumber() {
    java.lang.Object ref = streetNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      streetNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string street_number = 3;</code>
   * @return The bytes for streetNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreetNumberBytes() {
    java.lang.Object ref = streetNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      streetNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POST_CODE_FIELD_NUMBER = 4;
  private int postCode_;
  /**
   * <code>int32 post_code = 4;</code>
   * @return The postCode.
   */
  @java.lang.Override
  public int getPostCode() {
    return postCode_;
  }

  public static final int CITY_FIELD_NUMBER = 5;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 5;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 5;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LONGITUDE_FIELD_NUMBER = 6;
  private double longitude_;
  /**
   * <code>double longitude = 6;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
  }

  public static final int LATITUDE_FIELD_NUMBER = 7;
  private double latitude_;
  /**
   * <code>double latitude = 7;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (addressId_ != 0) {
      output.writeInt32(1, addressId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(street_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, street_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streetNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, streetNumber_);
    }
    if (postCode_ != 0) {
      output.writeInt32(4, postCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, city_);
    }
    if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
      output.writeDouble(6, longitude_);
    }
    if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
      output.writeDouble(7, latitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (addressId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, addressId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(street_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, street_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streetNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, streetNumber_);
    }
    if (postCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, postCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, city_);
    }
    if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, longitude_);
    }
    if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, latitude_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sep3.g3.rightoversjava.grpc.generated.AddressMessage)) {
      return super.equals(obj);
    }
    sep3.g3.rightoversjava.grpc.generated.AddressMessage other = (sep3.g3.rightoversjava.grpc.generated.AddressMessage) obj;

    if (getAddressId()
        != other.getAddressId()) return false;
    if (!getStreet()
        .equals(other.getStreet())) return false;
    if (!getStreetNumber()
        .equals(other.getStreetNumber())) return false;
    if (getPostCode()
        != other.getPostCode()) return false;
    if (!getCity()
        .equals(other.getCity())) return false;
    if (java.lang.Double.doubleToLongBits(getLongitude())
        != java.lang.Double.doubleToLongBits(
            other.getLongitude())) return false;
    if (java.lang.Double.doubleToLongBits(getLatitude())
        != java.lang.Double.doubleToLongBits(
            other.getLatitude())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDRESS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAddressId();
    hash = (37 * hash) + STREET_FIELD_NUMBER;
    hash = (53 * hash) + getStreet().hashCode();
    hash = (37 * hash) + STREET_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getStreetNumber().hashCode();
    hash = (37 * hash) + POST_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getPostCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sep3.g3.rightoversjava.grpc.generated.AddressMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sep3.g3.AddressMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sep3.g3.AddressMessage)
      sep3.g3.rightoversjava.grpc.generated.AddressMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_AddressMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_AddressMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.g3.rightoversjava.grpc.generated.AddressMessage.class, sep3.g3.rightoversjava.grpc.generated.AddressMessage.Builder.class);
    }

    // Construct using sep3.g3.rightoversjava.grpc.generated.AddressMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      addressId_ = 0;

      street_ = "";

      streetNumber_ = "";

      postCode_ = 0;

      city_ = "";

      longitude_ = 0D;

      latitude_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_AddressMessage_descriptor;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.AddressMessage getDefaultInstanceForType() {
      return sep3.g3.rightoversjava.grpc.generated.AddressMessage.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.AddressMessage build() {
      sep3.g3.rightoversjava.grpc.generated.AddressMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.AddressMessage buildPartial() {
      sep3.g3.rightoversjava.grpc.generated.AddressMessage result = new sep3.g3.rightoversjava.grpc.generated.AddressMessage(this);
      result.addressId_ = addressId_;
      result.street_ = street_;
      result.streetNumber_ = streetNumber_;
      result.postCode_ = postCode_;
      result.city_ = city_;
      result.longitude_ = longitude_;
      result.latitude_ = latitude_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sep3.g3.rightoversjava.grpc.generated.AddressMessage) {
        return mergeFrom((sep3.g3.rightoversjava.grpc.generated.AddressMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.g3.rightoversjava.grpc.generated.AddressMessage other) {
      if (other == sep3.g3.rightoversjava.grpc.generated.AddressMessage.getDefaultInstance()) return this;
      if (other.getAddressId() != 0) {
        setAddressId(other.getAddressId());
      }
      if (!other.getStreet().isEmpty()) {
        street_ = other.street_;
        onChanged();
      }
      if (!other.getStreetNumber().isEmpty()) {
        streetNumber_ = other.streetNumber_;
        onChanged();
      }
      if (other.getPostCode() != 0) {
        setPostCode(other.getPostCode());
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sep3.g3.rightoversjava.grpc.generated.AddressMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.g3.rightoversjava.grpc.generated.AddressMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int addressId_ ;
    /**
     * <code>int32 address_id = 1;</code>
     * @return The addressId.
     */
    @java.lang.Override
    public int getAddressId() {
      return addressId_;
    }
    /**
     * <code>int32 address_id = 1;</code>
     * @param value The addressId to set.
     * @return This builder for chaining.
     */
    public Builder setAddressId(int value) {
      
      addressId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 address_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddressId() {
      
      addressId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object street_ = "";
    /**
     * <code>string street = 2;</code>
     * @return The street.
     */
    public java.lang.String getStreet() {
      java.lang.Object ref = street_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        street_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string street = 2;</code>
     * @return The bytes for street.
     */
    public com.google.protobuf.ByteString
        getStreetBytes() {
      java.lang.Object ref = street_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        street_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string street = 2;</code>
     * @param value The street to set.
     * @return This builder for chaining.
     */
    public Builder setStreet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      street_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string street = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreet() {
      
      street_ = getDefaultInstance().getStreet();
      onChanged();
      return this;
    }
    /**
     * <code>string street = 2;</code>
     * @param value The bytes for street to set.
     * @return This builder for chaining.
     */
    public Builder setStreetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      street_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object streetNumber_ = "";
    /**
     * <code>string street_number = 3;</code>
     * @return The streetNumber.
     */
    public java.lang.String getStreetNumber() {
      java.lang.Object ref = streetNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        streetNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string street_number = 3;</code>
     * @return The bytes for streetNumber.
     */
    public com.google.protobuf.ByteString
        getStreetNumberBytes() {
      java.lang.Object ref = streetNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        streetNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string street_number = 3;</code>
     * @param value The streetNumber to set.
     * @return This builder for chaining.
     */
    public Builder setStreetNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      streetNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string street_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreetNumber() {
      
      streetNumber_ = getDefaultInstance().getStreetNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string street_number = 3;</code>
     * @param value The bytes for streetNumber to set.
     * @return This builder for chaining.
     */
    public Builder setStreetNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      streetNumber_ = value;
      onChanged();
      return this;
    }

    private int postCode_ ;
    /**
     * <code>int32 post_code = 4;</code>
     * @return The postCode.
     */
    @java.lang.Override
    public int getPostCode() {
      return postCode_;
    }
    /**
     * <code>int32 post_code = 4;</code>
     * @param value The postCode to set.
     * @return This builder for chaining.
     */
    public Builder setPostCode(int value) {
      
      postCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 post_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostCode() {
      
      postCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 5;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 5;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 5;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 5;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 6;</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 6;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 7;</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 7;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sep3.g3.AddressMessage)
  }

  // @@protoc_insertion_point(class_scope:sep3.g3.AddressMessage)
  private static final sep3.g3.rightoversjava.grpc.generated.AddressMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.g3.rightoversjava.grpc.generated.AddressMessage();
  }

  public static sep3.g3.rightoversjava.grpc.generated.AddressMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressMessage>
      PARSER = new com.google.protobuf.AbstractParser<AddressMessage>() {
    @java.lang.Override
    public AddressMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.AddressMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

