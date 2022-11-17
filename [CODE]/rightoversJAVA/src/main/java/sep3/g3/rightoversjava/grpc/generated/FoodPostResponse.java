// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodPost.proto

package sep3.g3.rightoversjava.grpc.generated;

/**
 * Protobuf type {@code sep3.g3.FoodPostResponse}
 */
public final class FoodPostResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sep3.g3.FoodPostResponse)
    FoodPostResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FoodPostResponse.newBuilder() to construct.
  private FoodPostResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FoodPostResponse() {
    title_ = "";
    category_ = "";
    description_ = "";
    pictureUrl_ = "";
    fpState_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FoodPostResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FoodPostResponse(
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

            fpId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            category_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            pictureUrl_ = s;
            break;
          }
          case 48: {

            daysUntilExpired_ = input.readInt32();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            fpState_ = s;
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
    return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_FoodPostResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_FoodPostResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.Builder.class);
  }

  public static final int FP_ID_FIELD_NUMBER = 1;
  private int fpId_;
  /**
   * <code>int32 fp_id = 1;</code>
   * @return The fpId.
   */
  @java.lang.Override
  public int getFpId() {
    return fpId_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORY__FIELD_NUMBER = 3;
  private volatile java.lang.Object category_;
  /**
   * <code>string category_ = 3;</code>
   * @return The category.
   */
  @java.lang.Override
  public java.lang.String getCategory() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      category_ = s;
      return s;
    }
  }
  /**
   * <code>string category_ = 3;</code>
   * @return The bytes for category.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryBytes() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      category_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PICTUREURL_FIELD_NUMBER = 5;
  private volatile java.lang.Object pictureUrl_;
  /**
   * <code>string pictureUrl = 5;</code>
   * @return The pictureUrl.
   */
  @java.lang.Override
  public java.lang.String getPictureUrl() {
    java.lang.Object ref = pictureUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pictureUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string pictureUrl = 5;</code>
   * @return The bytes for pictureUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPictureUrlBytes() {
    java.lang.Object ref = pictureUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pictureUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DAYSUNTILEXPIRED_FIELD_NUMBER = 6;
  private int daysUntilExpired_;
  /**
   * <code>int32 daysUntilExpired = 6;</code>
   * @return The daysUntilExpired.
   */
  @java.lang.Override
  public int getDaysUntilExpired() {
    return daysUntilExpired_;
  }

  public static final int FP_STATE_FIELD_NUMBER = 7;
  private volatile java.lang.Object fpState_;
  /**
   * <code>string fp_state = 7;</code>
   * @return The fpState.
   */
  @java.lang.Override
  public java.lang.String getFpState() {
    java.lang.Object ref = fpState_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fpState_ = s;
      return s;
    }
  }
  /**
   * <code>string fp_state = 7;</code>
   * @return The bytes for fpState.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFpStateBytes() {
    java.lang.Object ref = fpState_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fpState_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (fpId_ != 0) {
      output.writeInt32(1, fpId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(category_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, category_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pictureUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, pictureUrl_);
    }
    if (daysUntilExpired_ != 0) {
      output.writeInt32(6, daysUntilExpired_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fpState_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, fpState_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fpId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, fpId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(category_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, category_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pictureUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, pictureUrl_);
    }
    if (daysUntilExpired_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, daysUntilExpired_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fpState_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, fpState_);
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
    if (!(obj instanceof sep3.g3.rightoversjava.grpc.generated.FoodPostResponse)) {
      return super.equals(obj);
    }
    sep3.g3.rightoversjava.grpc.generated.FoodPostResponse other = (sep3.g3.rightoversjava.grpc.generated.FoodPostResponse) obj;

    if (getFpId()
        != other.getFpId()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getCategory()
        .equals(other.getCategory())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getPictureUrl()
        .equals(other.getPictureUrl())) return false;
    if (getDaysUntilExpired()
        != other.getDaysUntilExpired()) return false;
    if (!getFpState()
        .equals(other.getFpState())) return false;
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
    hash = (37 * hash) + FP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFpId();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + CATEGORY__FIELD_NUMBER;
    hash = (53 * hash) + getCategory().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + PICTUREURL_FIELD_NUMBER;
    hash = (53 * hash) + getPictureUrl().hashCode();
    hash = (37 * hash) + DAYSUNTILEXPIRED_FIELD_NUMBER;
    hash = (53 * hash) + getDaysUntilExpired();
    hash = (37 * hash) + FP_STATE_FIELD_NUMBER;
    hash = (53 * hash) + getFpState().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parseFrom(
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
  public static Builder newBuilder(sep3.g3.rightoversjava.grpc.generated.FoodPostResponse prototype) {
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
   * Protobuf type {@code sep3.g3.FoodPostResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sep3.g3.FoodPostResponse)
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_FoodPostResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_FoodPostResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.class, sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.Builder.class);
    }

    // Construct using sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.newBuilder()
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
      fpId_ = 0;

      title_ = "";

      category_ = "";

      description_ = "";

      pictureUrl_ = "";

      daysUntilExpired_ = 0;

      fpState_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_FoodPostResponse_descriptor;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse getDefaultInstanceForType() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse build() {
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse buildPartial() {
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse result = new sep3.g3.rightoversjava.grpc.generated.FoodPostResponse(this);
      result.fpId_ = fpId_;
      result.title_ = title_;
      result.category_ = category_;
      result.description_ = description_;
      result.pictureUrl_ = pictureUrl_;
      result.daysUntilExpired_ = daysUntilExpired_;
      result.fpState_ = fpState_;
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
      if (other instanceof sep3.g3.rightoversjava.grpc.generated.FoodPostResponse) {
        return mergeFrom((sep3.g3.rightoversjava.grpc.generated.FoodPostResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.g3.rightoversjava.grpc.generated.FoodPostResponse other) {
      if (other == sep3.g3.rightoversjava.grpc.generated.FoodPostResponse.getDefaultInstance()) return this;
      if (other.getFpId() != 0) {
        setFpId(other.getFpId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getCategory().isEmpty()) {
        category_ = other.category_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getPictureUrl().isEmpty()) {
        pictureUrl_ = other.pictureUrl_;
        onChanged();
      }
      if (other.getDaysUntilExpired() != 0) {
        setDaysUntilExpired(other.getDaysUntilExpired());
      }
      if (!other.getFpState().isEmpty()) {
        fpState_ = other.fpState_;
        onChanged();
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
      sep3.g3.rightoversjava.grpc.generated.FoodPostResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.g3.rightoversjava.grpc.generated.FoodPostResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int fpId_ ;
    /**
     * <code>int32 fp_id = 1;</code>
     * @return The fpId.
     */
    @java.lang.Override
    public int getFpId() {
      return fpId_;
    }
    /**
     * <code>int32 fp_id = 1;</code>
     * @param value The fpId to set.
     * @return This builder for chaining.
     */
    public Builder setFpId(int value) {
      
      fpId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fp_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpId() {
      
      fpId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object category_ = "";
    /**
     * <code>string category_ = 3;</code>
     * @return The category.
     */
    public java.lang.String getCategory() {
      java.lang.Object ref = category_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        category_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string category_ = 3;</code>
     * @return The bytes for category.
     */
    public com.google.protobuf.ByteString
        getCategoryBytes() {
      java.lang.Object ref = category_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        category_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string category_ = 3;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string category_ = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      
      category_ = getDefaultInstance().getCategory();
      onChanged();
      return this;
    }
    /**
     * <code>string category_ = 3;</code>
     * @param value The bytes for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      category_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 4;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pictureUrl_ = "";
    /**
     * <code>string pictureUrl = 5;</code>
     * @return The pictureUrl.
     */
    public java.lang.String getPictureUrl() {
      java.lang.Object ref = pictureUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pictureUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pictureUrl = 5;</code>
     * @return The bytes for pictureUrl.
     */
    public com.google.protobuf.ByteString
        getPictureUrlBytes() {
      java.lang.Object ref = pictureUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pictureUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pictureUrl = 5;</code>
     * @param value The pictureUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPictureUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pictureUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pictureUrl = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPictureUrl() {
      
      pictureUrl_ = getDefaultInstance().getPictureUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string pictureUrl = 5;</code>
     * @param value The bytes for pictureUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPictureUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pictureUrl_ = value;
      onChanged();
      return this;
    }

    private int daysUntilExpired_ ;
    /**
     * <code>int32 daysUntilExpired = 6;</code>
     * @return The daysUntilExpired.
     */
    @java.lang.Override
    public int getDaysUntilExpired() {
      return daysUntilExpired_;
    }
    /**
     * <code>int32 daysUntilExpired = 6;</code>
     * @param value The daysUntilExpired to set.
     * @return This builder for chaining.
     */
    public Builder setDaysUntilExpired(int value) {
      
      daysUntilExpired_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 daysUntilExpired = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDaysUntilExpired() {
      
      daysUntilExpired_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fpState_ = "";
    /**
     * <code>string fp_state = 7;</code>
     * @return The fpState.
     */
    public java.lang.String getFpState() {
      java.lang.Object ref = fpState_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fpState_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fp_state = 7;</code>
     * @return The bytes for fpState.
     */
    public com.google.protobuf.ByteString
        getFpStateBytes() {
      java.lang.Object ref = fpState_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fpState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fp_state = 7;</code>
     * @param value The fpState to set.
     * @return This builder for chaining.
     */
    public Builder setFpState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fpState_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fp_state = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpState() {
      
      fpState_ = getDefaultInstance().getFpState();
      onChanged();
      return this;
    }
    /**
     * <code>string fp_state = 7;</code>
     * @param value The bytes for fpState to set.
     * @return This builder for chaining.
     */
    public Builder setFpStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fpState_ = value;
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


    // @@protoc_insertion_point(builder_scope:sep3.g3.FoodPostResponse)
  }

  // @@protoc_insertion_point(class_scope:sep3.g3.FoodPostResponse)
  private static final sep3.g3.rightoversjava.grpc.generated.FoodPostResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.g3.rightoversjava.grpc.generated.FoodPostResponse();
  }

  public static sep3.g3.rightoversjava.grpc.generated.FoodPostResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FoodPostResponse>
      PARSER = new com.google.protobuf.AbstractParser<FoodPostResponse>() {
    @java.lang.Override
    public FoodPostResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FoodPostResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FoodPostResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FoodPostResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.FoodPostResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
