// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_predict_v2.proto

package org.kie.trustyai.connectors.kserve.v2.grpc;

/**
 * Protobuf type {@code inference.ServerMetadataResponse}
 */
public final class ServerMetadataResponse extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:inference.ServerMetadataResponse)
        ServerMetadataResponseOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ServerMetadataResponse.newBuilder() to construct.
    private ServerMetadataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ServerMetadataResponse() {
        name_ = "";
        version_ = "";
        extensions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new ServerMetadataResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
        return this.unknownFields;
    }

    private ServerMetadataResponse(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
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
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();

                        name_ = s;
                        break;
                    }
                    case 18: {
                        java.lang.String s = input.readStringRequireUtf8();

                        version_ = s;
                        break;
                    }
                    case 26: {
                        java.lang.String s = input.readStringRequireUtf8();
                        if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                            extensions_ = new com.google.protobuf.LazyStringArrayList();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        extensions_.add(s);
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
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            if (((mutable_bitField0_ & 0x00000001) != 0)) {
                extensions_ = extensions_.getUnmodifiableView();
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
        return org.kie.trustyai.connectors.kserve.v2.grpc.GrpcPredictV2.internal_static_inference_ServerMetadataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
        return org.kie.trustyai.connectors.kserve.v2.grpc.GrpcPredictV2.internal_static_inference_ServerMetadataResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.class, org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;

    /**
     * <pre>
     * The server name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * 
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            name_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * The server name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * 
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
            getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            name_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int VERSION_FIELD_NUMBER = 2;
    private volatile java.lang.Object version_;

    /**
     * <pre>
     * The server version.
     * </pre>
     *
     * <code>string version = 2;</code>
     * 
     * @return The version.
     */
    @java.lang.Override
    public java.lang.String getVersion() {
        java.lang.Object ref = version_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            version_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * The server version.
     * </pre>
     *
     * <code>string version = 2;</code>
     * 
     * @return The bytes for version.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
            getVersionBytes() {
        java.lang.Object ref = version_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            version_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList extensions_;

    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * 
     * @return A list containing the extensions.
     */
    public com.google.protobuf.ProtocolStringList
            getExtensionsList() {
        return extensions_;
    }

    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * 
     * @return The count of extensions.
     */
    public int getExtensionsCount() {
        return extensions_.size();
    }

    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * 
     * @param index The index of the element to return.
     * @return The extensions at the given index.
     */
    public java.lang.String getExtensions(int index) {
        return extensions_.get(index);
    }

    /**
     * <pre>
     * The extensions supported by the server.
     * </pre>
     *
     * <code>repeated string extensions = 3;</code>
     * 
     * @param index The index of the value to return.
     * @return The bytes of the extensions at the given index.
     */
    public com.google.protobuf.ByteString
            getExtensionsBytes(int index) {
        return extensions_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
        }
        for (int i = 0; i < extensions_.size(); i++) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, extensions_.getRaw(i));
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < extensions_.size(); i++) {
                dataSize += computeStringSizeNoTag(extensions_.getRaw(i));
            }
            size += dataSize;
            size += 1 * getExtensionsList().size();
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
        if (!(obj instanceof org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse)) {
            return super.equals(obj);
        }
        org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse other = (org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse) obj;

        if (!getName()
                .equals(other.getName()))
            return false;
        if (!getVersion()
                .equals(other.getVersion()))
            return false;
        if (!getExtensionsList()
                .equals(other.getExtensionsList()))
            return false;
        if (!unknownFields.equals(other.unknownFields))
            return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        hash = (37 * hash) + VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getVersion().hashCode();
        if (getExtensionsCount() > 0) {
            hash = (37 * hash) + EXTENSIONS_FIELD_NUMBER;
            hash = (53 * hash) + getExtensionsList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder()
                : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code inference.ServerMetadataResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:inference.ServerMetadataResponse)
            org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
            return org.kie.trustyai.connectors.kserve.v2.grpc.GrpcPredictV2.internal_static_inference_ServerMetadataResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return org.kie.trustyai.connectors.kserve.v2.grpc.GrpcPredictV2.internal_static_inference_ServerMetadataResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.class, org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.Builder.class);
        }

        // Construct using org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            name_ = "";

            version_ = "";

            extensions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
            return org.kie.trustyai.connectors.kserve.v2.grpc.GrpcPredictV2.internal_static_inference_ServerMetadataResponse_descriptor;
        }

        @java.lang.Override
        public org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse getDefaultInstanceForType() {
            return org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.getDefaultInstance();
        }

        @java.lang.Override
        public org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse build() {
            org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse buildPartial() {
            org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse result = new org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse(this);
            int from_bitField0_ = bitField0_;
            result.name_ = name_;
            result.version_ = version_;
            if (((bitField0_ & 0x00000001) != 0)) {
                extensions_ = extensions_.getUnmodifiableView();
                bitField0_ = (bitField0_ & ~0x00000001);
            }
            result.extensions_ = extensions_;
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
            if (other instanceof org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse) {
                return mergeFrom((org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse other) {
            if (other == org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse.getDefaultInstance())
                return this;
            if (!other.getName().isEmpty()) {
                name_ = other.name_;
                onChanged();
            }
            if (!other.getVersion().isEmpty()) {
                version_ = other.version_;
                onChanged();
            }
            if (!other.extensions_.isEmpty()) {
                if (extensions_.isEmpty()) {
                    extensions_ = other.extensions_;
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    ensureExtensionsIsMutable();
                    extensions_.addAll(other.extensions_);
                }
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
            org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private java.lang.Object name_ = "";

        /**
         * <pre>
         * The server name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * 
         * @return The name.
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * The server name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * 
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
                getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * The server name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * 
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            name_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The server name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * 
         * @return This builder for chaining.
         */
        public Builder clearName() {

            name_ = getDefaultInstance().getName();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The server name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * 
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            name_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object version_ = "";

        /**
         * <pre>
         * The server version.
         * </pre>
         *
         * <code>string version = 2;</code>
         * 
         * @return The version.
         */
        public java.lang.String getVersion() {
            java.lang.Object ref = version_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                version_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * The server version.
         * </pre>
         *
         * <code>string version = 2;</code>
         * 
         * @return The bytes for version.
         */
        public com.google.protobuf.ByteString
                getVersionBytes() {
            java.lang.Object ref = version_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                version_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * The server version.
         * </pre>
         *
         * <code>string version = 2;</code>
         * 
         * @param value The version to set.
         * @return This builder for chaining.
         */
        public Builder setVersion(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            version_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The server version.
         * </pre>
         *
         * <code>string version = 2;</code>
         * 
         * @return This builder for chaining.
         */
        public Builder clearVersion() {

            version_ = getDefaultInstance().getVersion();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The server version.
         * </pre>
         *
         * <code>string version = 2;</code>
         * 
         * @param value The bytes for version to set.
         * @return This builder for chaining.
         */
        public Builder setVersionBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            version_ = value;
            onChanged();
            return this;
        }

        private com.google.protobuf.LazyStringList extensions_ = com.google.protobuf.LazyStringArrayList.EMPTY;

        private void ensureExtensionsIsMutable() {
            if (!((bitField0_ & 0x00000001) != 0)) {
                extensions_ = new com.google.protobuf.LazyStringArrayList(extensions_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @return A list containing the extensions.
         */
        public com.google.protobuf.ProtocolStringList
                getExtensionsList() {
            return extensions_.getUnmodifiableView();
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @return The count of extensions.
         */
        public int getExtensionsCount() {
            return extensions_.size();
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @param index The index of the element to return.
         * @return The extensions at the given index.
         */
        public java.lang.String getExtensions(int index) {
            return extensions_.get(index);
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @param index The index of the value to return.
         * @return The bytes of the extensions at the given index.
         */
        public com.google.protobuf.ByteString
                getExtensionsBytes(int index) {
            return extensions_.getByteString(index);
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @param index The index to set the value at.
         * @param value The extensions to set.
         * @return This builder for chaining.
         */
        public Builder setExtensions(
                int index, java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureExtensionsIsMutable();
            extensions_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @param value The extensions to add.
         * @return This builder for chaining.
         */
        public Builder addExtensions(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureExtensionsIsMutable();
            extensions_.add(value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @param values The extensions to add.
         * @return This builder for chaining.
         */
        public Builder addAllExtensions(
                java.lang.Iterable<java.lang.String> values) {
            ensureExtensionsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, extensions_);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @return This builder for chaining.
         */
        public Builder clearExtensions() {
            extensions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The extensions supported by the server.
         * </pre>
         *
         * <code>repeated string extensions = 3;</code>
         * 
         * @param value The bytes of the extensions to add.
         * @return This builder for chaining.
         */
        public Builder addExtensionsBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            ensureExtensionsIsMutable();
            extensions_.add(value);
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

        // @@protoc_insertion_point(builder_scope:inference.ServerMetadataResponse)
    }

    // @@protoc_insertion_point(class_scope:inference.ServerMetadataResponse)
    private static final org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse();
    }

    public static org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerMetadataResponse> PARSER = new com.google.protobuf.AbstractParser<ServerMetadataResponse>() {
        @java.lang.Override
        public ServerMetadataResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ServerMetadataResponse(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ServerMetadataResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerMetadataResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public org.kie.trustyai.connectors.kserve.v2.grpc.ServerMetadataResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
