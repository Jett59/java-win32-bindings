// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
 class WINDOWS_30 extends WINDOWS_29 {

    public static int QUERY_FILE_LAYOUT_REPARSE_TAG_INVALID() {
        return (int)2L;
    }
    public static long FSCTL_QUERY_REGION_INFO_INPUT_VERSION() {
        return 32L;
    }
    public static long FSCTL_QUERY_REGION_INFO_OUTPUT_VERSION() {
        return 64L;
    }
    public static int STREAMS_INVALID_ID() {
        return (int)0L;
    }
    public static int STREAMS_MAX_ID() {
        return (int)65535L;
    }
    public static int STREAMS_ASSOCIATE_ID_CLEAR() {
        return (int)1L;
    }
    public static int STREAMS_ASSOCIATE_ID_SET() {
        return (int)2L;
    }
    public static int DAX_ALLOC_ALIGNMENT_FLAG_MANDATORY() {
        return (int)1L;
    }
    public static int DAX_ALLOC_ALIGNMENT_FLAG_FALLBACK_SPECIFIED() {
        return (int)2L;
    }
    public static int WOF_CURRENT_VERSION() {
        return (int)1L;
    }
    public static int WOF_PROVIDER_WIM() {
        return (int)1L;
    }
    public static int WOF_PROVIDER_FILE() {
        return (int)2L;
    }
    public static int WOF_PROVIDER_CLOUD() {
        return (int)3L;
    }
    public static int WIM_PROVIDER_CURRENT_VERSION() {
        return (int)1L;
    }
    public static int WIM_PROVIDER_EXTERNAL_FLAG_NOT_ACTIVE() {
        return (int)1L;
    }
    public static int WIM_PROVIDER_EXTERNAL_FLAG_SUSPENDED() {
        return (int)2L;
    }
    public static int WIM_BOOT_OS_WIM() {
        return (int)1L;
    }
    public static int WIM_BOOT_NOT_OS_WIM() {
        return (int)0L;
    }
    public static int FILE_PROVIDER_CURRENT_VERSION() {
        return (int)1L;
    }
    public static int FILE_PROVIDER_SINGLE_FILE() {
        return (int)1L;
    }
    public static int FILE_PROVIDER_COMPRESSION_XPRESS4K() {
        return (int)0L;
    }
    public static int FILE_PROVIDER_COMPRESSION_LZX() {
        return (int)1L;
    }
    public static int FILE_PROVIDER_COMPRESSION_XPRESS8K() {
        return (int)2L;
    }
    public static int FILE_PROVIDER_COMPRESSION_XPRESS16K() {
        return (int)3L;
    }
    public static int FILE_PROVIDER_COMPRESSION_MAXIMUM() {
        return (int)4L;
    }
    public static int FILE_PROVIDER_FLAG_COMPRESS_ON_WRITE() {
        return (int)1L;
    }
    public static int CONTAINER_VOLUME_STATE_HOSTING_CONTAINER() {
        return (int)1L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_SCRATCH_ROOT() {
        return (int)1L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_LAYER_ROOT() {
        return (int)2L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_ROOT() {
        return (int)4L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_TARGET_ROOT() {
        return (int)8L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_EXCEPTION_ROOT() {
        return (int)16L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_BIND_ROOT() {
        return (int)32L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_BIND_TARGET_ROOT() {
        return (int)64L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_BIND_EXCEPTION_ROOT() {
        return (int)128L;
    }
    public static int CONTAINER_ROOT_INFO_FLAG_BIND_DO_NOT_MAP_NAME() {
        return (int)256L;
    }
    public static int CONTAINER_ROOT_INFO_VALID_FLAGS() {
        return (int)511L;
    }
    public static int IOCTL_VOLUME_GET_VOLUME_DISK_EXTENTS() {
        return (int)5636096L;
    }
    public static int IOCTL_VOLUME_ONLINE() {
        return (int)5685256L;
    }
    public static int IOCTL_VOLUME_OFFLINE() {
        return (int)5685260L;
    }
    public static int IOCTL_VOLUME_IS_CLUSTERED() {
        return (int)5636144L;
    }
    public static int IOCTL_VOLUME_GET_GPT_ATTRIBUTES() {
        return (int)5636152L;
    }
    public static int IRP_EXT_TRACK_OFFSET_HEADER_VALIDATION_VALUE() {
        return (int)21583L;
    }
    public static int SCARD_PROTOCOL_Tx() {
        return (int)3L;
    }
    public static int SCARD_PROTOCOL_DEFAULT() {
        return (int)2147483648L;
    }
    public static int IOCTL_SMARTCARD_POWER() {
        return (int)3211268L;
    }
    public static int IOCTL_SMARTCARD_GET_ATTRIBUTE() {
        return (int)3211272L;
    }
    public static int IOCTL_SMARTCARD_SET_ATTRIBUTE() {
        return (int)3211276L;
    }
    public static int IOCTL_SMARTCARD_CONFISCATE() {
        return (int)3211280L;
    }
    public static int IOCTL_SMARTCARD_TRANSMIT() {
        return (int)3211284L;
    }
    public static int IOCTL_SMARTCARD_EJECT() {
        return (int)3211288L;
    }
    public static int IOCTL_SMARTCARD_SWALLOW() {
        return (int)3211292L;
    }
    public static int IOCTL_SMARTCARD_IS_PRESENT() {
        return (int)3211304L;
    }
    public static int IOCTL_SMARTCARD_IS_ABSENT() {
        return (int)3211308L;
    }
    public static int IOCTL_SMARTCARD_SET_PROTOCOL() {
        return (int)3211312L;
    }
    public static int IOCTL_SMARTCARD_GET_STATE() {
        return (int)3211320L;
    }
    public static int IOCTL_SMARTCARD_GET_LAST_ERROR() {
        return (int)3211324L;
    }
    public static int IOCTL_SMARTCARD_GET_PERF_CNTR() {
        return (int)3211328L;
    }
    public static int IOCTL_SMARTCARD_GET_FEATURE_REQUEST() {
        return (int)3224864L;
    }
    public static int SCARD_ATTR_VENDOR_NAME() {
        return (int)65792L;
    }
    public static int SCARD_ATTR_VENDOR_IFD_TYPE() {
        return (int)65793L;
    }
    public static int SCARD_ATTR_VENDOR_IFD_VERSION() {
        return (int)65794L;
    }
    public static int SCARD_ATTR_VENDOR_IFD_SERIAL_NO() {
        return (int)65795L;
    }
    public static int SCARD_ATTR_CHANNEL_ID() {
        return (int)131344L;
    }
    public static int SCARD_ATTR_PROTOCOL_TYPES() {
        return (int)196896L;
    }
    public static int SCARD_ATTR_DEFAULT_CLK() {
        return (int)196897L;
    }
    public static int SCARD_ATTR_MAX_CLK() {
        return (int)196898L;
    }
    public static int SCARD_ATTR_DEFAULT_DATA_RATE() {
        return (int)196899L;
    }
    public static int SCARD_ATTR_MAX_DATA_RATE() {
        return (int)196900L;
    }
    public static int SCARD_ATTR_MAX_IFSD() {
        return (int)196901L;
    }
    public static int SCARD_ATTR_POWER_MGMT_SUPPORT() {
        return (int)262449L;
    }
    public static int SCARD_ATTR_USER_TO_CARD_AUTH_DEVICE() {
        return (int)328000L;
    }
    public static int SCARD_ATTR_USER_AUTH_INPUT_DEVICE() {
        return (int)328002L;
    }
    public static int SCARD_ATTR_CHARACTERISTICS() {
        return (int)393552L;
    }
    public static int SCARD_ATTR_CURRENT_PROTOCOL_TYPE() {
        return (int)524801L;
    }
    public static int SCARD_ATTR_CURRENT_CLK() {
        return (int)524802L;
    }
    public static int SCARD_ATTR_CURRENT_F() {
        return (int)524803L;
    }
    public static int SCARD_ATTR_CURRENT_D() {
        return (int)524804L;
    }
    public static int SCARD_ATTR_CURRENT_N() {
        return (int)524805L;
    }
    public static int SCARD_ATTR_CURRENT_W() {
        return (int)524806L;
    }
    public static int SCARD_ATTR_CURRENT_IFSC() {
        return (int)524807L;
    }
    public static int SCARD_ATTR_CURRENT_IFSD() {
        return (int)524808L;
    }
    public static int SCARD_ATTR_CURRENT_BWT() {
        return (int)524809L;
    }
    public static int SCARD_ATTR_CURRENT_CWT() {
        return (int)524810L;
    }
    public static int SCARD_ATTR_CURRENT_EBC_ENCODING() {
        return (int)524811L;
    }
    public static int SCARD_ATTR_EXTENDED_BWT() {
        return (int)524812L;
    }
    public static int SCARD_ATTR_ICC_PRESENCE() {
        return (int)590592L;
    }
    public static int SCARD_ATTR_ICC_INTERFACE_STATUS() {
        return (int)590593L;
    }
    public static int SCARD_ATTR_CURRENT_IO_STATE() {
        return (int)590594L;
    }
    public static int SCARD_ATTR_ATR_STRING() {
        return (int)590595L;
    }
    public static int SCARD_ATTR_ICC_TYPE_PER_ATR() {
        return (int)590596L;
    }
    public static int SCARD_ATTR_ESC_RESET() {
        return (int)499712L;
    }
    public static int SCARD_ATTR_ESC_CANCEL() {
        return (int)499715L;
    }
    public static int SCARD_ATTR_ESC_AUTHREQUEST() {
        return (int)499717L;
    }
    public static int SCARD_ATTR_MAXINPUT() {
        return (int)499719L;
    }
    public static int SCARD_ATTR_VENDOR_SPECIFIC_INFO() {
        return (int)499720L;
    }
    public static int SCARD_ATTR_DEVICE_UNIT() {
        return (int)2147418113L;
    }
    public static int SCARD_ATTR_DEVICE_IN_USE() {
        return (int)2147418114L;
    }
    public static int SCARD_ATTR_DEVICE_FRIENDLY_NAME_A() {
        return (int)2147418115L;
    }
    public static int SCARD_ATTR_DEVICE_SYSTEM_NAME_A() {
        return (int)2147418116L;
    }
    public static int SCARD_ATTR_DEVICE_FRIENDLY_NAME_W() {
        return (int)2147418117L;
    }
    public static int SCARD_ATTR_DEVICE_SYSTEM_NAME_W() {
        return (int)2147418118L;
    }
    public static int SCARD_ATTR_SUPRESS_T1_IFS_REQUEST() {
        return (int)2147418119L;
    }
    public static int SCARD_PERF_NUM_TRANSMISSIONS() {
        return (int)2147352577L;
    }
    public static int SCARD_PERF_BYTES_TRANSMITTED() {
        return (int)2147352578L;
    }
    public static int SCARD_PERF_TRANSMISSION_TIME() {
        return (int)2147352579L;
    }
    public static int SCARD_ATTR_DEVICE_FRIENDLY_NAME() {
        return (int)2147418115L;
    }
    public static int SCARD_ATTR_DEVICE_SYSTEM_NAME() {
        return (int)2147418116L;
    }
    public static int SCARD_AUTOALLOCATE() {
        return (int)4294967295L;
    }
    public static MemorySegment SCARD_ALL_READERS() {
        return constants$913.SCARD_ALL_READERS$SEGMENT;
    }
    public static MemorySegment SCARD_DEFAULT_READERS() {
        return constants$913.SCARD_DEFAULT_READERS$SEGMENT;
    }
    public static MemorySegment SCARD_LOCAL_READERS() {
        return constants$913.SCARD_LOCAL_READERS$SEGMENT;
    }
    public static MemorySegment SCARD_SYSTEM_READERS() {
        return constants$913.SCARD_SYSTEM_READERS$SEGMENT;
    }
    public static int SCARD_READER_SEL_AUTH_PACKAGE() {
        return (int)4294966667L;
    }
    public static int DSPRINT_PENDING() {
        return (int)2147483648L;
    }
    public static int MAX_FORM_KEYWORD_LENGTH() {
        return (int)64L;
    }
    public static int NORMAL_PRINT() {
        return (int)0L;
    }
    public static int REVERSE_PRINT() {
        return (int)1L;
    }
    public static int PPCAPS_RIGHT_THEN_DOWN() {
        return (int)1L;
    }
    public static int PPCAPS_DOWN_THEN_RIGHT() {
        return (int)2L;
    }
    public static int PPCAPS_LEFT_THEN_DOWN() {
        return (int)4L;
    }
    public static int PPCAPS_DOWN_THEN_LEFT() {
        return (int)8L;
    }
    public static int PPCAPS_BORDER_PRINT() {
        return (int)1L;
    }
    public static int PPCAPS_BOOKLET_EDGE() {
        return (int)1L;
    }
    public static int PPCAPS_REVERSE_PAGES_FOR_REVERSE_DUPLEX() {
        return (int)1L;
    }
    public static int PPCAPS_DONT_SEND_EXTRA_PAGES_FOR_DUPLEX() {
        return (int)2L;
    }
    public static int PPCAPS_SQUARE_SCALING() {
        return (int)1L;
    }
    public static MemorySegment BIDI_ACTION_ENUM_SCHEMA() {
        return constants$914.BIDI_ACTION_ENUM_SCHEMA$SEGMENT;
    }
    public static MemorySegment BIDI_ACTION_GET() {
        return constants$914.BIDI_ACTION_GET$SEGMENT;
    }
    public static MemorySegment BIDI_ACTION_SET() {
        return constants$914.BIDI_ACTION_SET$SEGMENT;
    }
    public static MemorySegment BIDI_ACTION_GET_ALL() {
        return constants$914.BIDI_ACTION_GET_ALL$SEGMENT;
    }
    public static MemorySegment BIDI_ACTION_GET_WITH_ARGUMENT() {
        return constants$914.BIDI_ACTION_GET_WITH_ARGUMENT$SEGMENT;
    }
    public static int ERROR_BIDI_NOT_SUPPORTED() {
        return (int)50L;
    }
    public static int ERROR_BIDI_STATUS_WARNING() {
        return (int)13001L;
    }
    public static int ERROR_BIDI_SCHEMA_READ_ONLY() {
        return (int)13002L;
    }
    public static int ERROR_BIDI_SERVER_OFFLINE() {
        return (int)13003L;
    }
    public static int ERROR_BIDI_DEVICE_OFFLINE() {
        return (int)13004L;
    }
    public static int ERROR_BIDI_SCHEMA_NOT_SUPPORTED() {
        return (int)13005L;
    }
    public static int ERROR_BIDI_SET_DIFFERENT_TYPE() {
        return (int)13006L;
    }
    public static int ERROR_BIDI_SET_MULTIPLE_SCHEMAPATH() {
        return (int)13007L;
    }
    public static int ERROR_BIDI_SET_INVALID_SCHEMAPATH() {
        return (int)13008L;
    }
    public static int ERROR_BIDI_SET_UNKNOWN_FAILURE() {
        return (int)13009L;
    }
    public static int ERROR_BIDI_SCHEMA_WRITE_ONLY() {
        return (int)13010L;
    }
    public static int ERROR_BIDI_GET_REQUIRES_ARGUMENT() {
        return (int)13011L;
    }
    public static int ERROR_BIDI_GET_ARGUMENT_NOT_SUPPORTED() {
        return (int)13012L;
    }
    public static int ERROR_BIDI_GET_MISSING_ARGUMENT() {
        return (int)13013L;
    }
    public static int ERROR_BIDI_DEVICE_CONFIG_UNCHANGED() {
        return (int)13014L;
    }
    public static int ERROR_BIDI_NO_LOCALIZED_RESOURCES() {
        return (int)13015L;
    }
    public static int ERROR_BIDI_NO_BIDI_SCHEMA_EXTENSIONS() {
        return (int)13016L;
    }
    public static int ERROR_BIDI_UNSUPPORTED_CLIENT_LANGUAGE() {
        return (int)13017L;
    }
    public static int ERROR_BIDI_UNSUPPORTED_RESOURCE_FORMAT() {
        return (int)13018L;
    }
    public static int PRINTER_CHANGE_TIMEOUT() {
        return (int)2147483648L;
    }
    public static int PRINTER_ERROR_INFORMATION() {
        return (int)2147483648L;
    }
    public static MemorySegment SPLREG_DEFAULT_SPOOL_DIRECTORY() {
        return constants$914.SPLREG_DEFAULT_SPOOL_DIRECTORY$SEGMENT;
    }
    public static MemorySegment SPLREG_PORT_THREAD_PRIORITY_DEFAULT() {
        return constants$915.SPLREG_PORT_THREAD_PRIORITY_DEFAULT$SEGMENT;
    }
    public static MemorySegment SPLREG_PORT_THREAD_PRIORITY() {
        return constants$915.SPLREG_PORT_THREAD_PRIORITY$SEGMENT;
    }
    public static MemorySegment SPLREG_SCHEDULER_THREAD_PRIORITY_DEFAULT() {
        return constants$915.SPLREG_SCHEDULER_THREAD_PRIORITY_DEFAULT$SEGMENT;
    }
    public static MemorySegment SPLREG_SCHEDULER_THREAD_PRIORITY() {
        return constants$915.SPLREG_SCHEDULER_THREAD_PRIORITY$SEGMENT;
    }
    public static MemorySegment SPLREG_BEEP_ENABLED() {
        return constants$915.SPLREG_BEEP_ENABLED$SEGMENT;
    }
    public static MemorySegment SPLREG_NET_POPUP() {
        return constants$915.SPLREG_NET_POPUP$SEGMENT;
    }
    public static MemorySegment SPLREG_RETRY_POPUP() {
        return constants$916.SPLREG_RETRY_POPUP$SEGMENT;
    }
    public static MemorySegment SPLREG_NET_POPUP_TO_COMPUTER() {
        return constants$916.SPLREG_NET_POPUP_TO_COMPUTER$SEGMENT;
    }
    public static MemorySegment SPLREG_EVENT_LOG() {
        return constants$916.SPLREG_EVENT_LOG$SEGMENT;
    }
    public static MemorySegment SPLREG_MAJOR_VERSION() {
        return constants$916.SPLREG_MAJOR_VERSION$SEGMENT;
    }
    public static MemorySegment SPLREG_MINOR_VERSION() {
        return constants$916.SPLREG_MINOR_VERSION$SEGMENT;
    }
    public static MemorySegment SPLREG_ARCHITECTURE() {
        return constants$916.SPLREG_ARCHITECTURE$SEGMENT;
    }
    public static MemorySegment SPLREG_OS_VERSION() {
        return constants$917.SPLREG_OS_VERSION$SEGMENT;
    }
    public static MemorySegment SPLREG_OS_VERSIONEX() {
        return constants$917.SPLREG_OS_VERSIONEX$SEGMENT;
    }
    public static MemorySegment SPLREG_DS_PRESENT() {
        return constants$917.SPLREG_DS_PRESENT$SEGMENT;
    }
    public static MemorySegment SPLREG_DS_PRESENT_FOR_USER() {
        return constants$917.SPLREG_DS_PRESENT_FOR_USER$SEGMENT;
    }
    public static MemorySegment SPLREG_REMOTE_FAX() {
        return constants$917.SPLREG_REMOTE_FAX$SEGMENT;
    }
    public static MemorySegment SPLREG_RESTART_JOB_ON_POOL_ERROR() {
        return constants$917.SPLREG_RESTART_JOB_ON_POOL_ERROR$SEGMENT;
    }
    public static MemorySegment SPLREG_RESTART_JOB_ON_POOL_ENABLED() {
        return constants$918.SPLREG_RESTART_JOB_ON_POOL_ENABLED$SEGMENT;
    }
    public static MemorySegment SPLREG_DNS_MACHINE_NAME() {
        return constants$918.SPLREG_DNS_MACHINE_NAME$SEGMENT;
    }
    public static MemorySegment SPLREG_ALLOW_USER_MANAGEFORMS() {
        return constants$918.SPLREG_ALLOW_USER_MANAGEFORMS$SEGMENT;
    }
    public static MemorySegment SPLREG_WEBSHAREMGMT() {
        return constants$918.SPLREG_WEBSHAREMGMT$SEGMENT;
    }
    public static short SPLREG_PRINT_DRIVER_ISOLATION_GROUPS_SEPARATOR() {
        return (short)92L;
    }
    public static MemorySegment SPLREG_PRINT_DRIVER_ISOLATION_GROUPS() {
        return constants$918.SPLREG_PRINT_DRIVER_ISOLATION_GROUPS$SEGMENT;
    }
    public static MemorySegment SPLREG_PRINT_DRIVER_ISOLATION_TIME_BEFORE_RECYCLE() {
        return constants$918.SPLREG_PRINT_DRIVER_ISOLATION_TIME_BEFORE_RECYCLE$SEGMENT;
    }
    public static MemorySegment SPLREG_PRINT_DRIVER_ISOLATION_MAX_OBJECTS_BEFORE_RECYCLE() {
        return constants$919.SPLREG_PRINT_DRIVER_ISOLATION_MAX_OBJECTS_BEFORE_RECYCLE$SEGMENT;
    }
    public static MemorySegment SPLREG_PRINT_DRIVER_ISOLATION_IDLE_TIMEOUT() {
        return constants$919.SPLREG_PRINT_DRIVER_ISOLATION_IDLE_TIMEOUT$SEGMENT;
    }
    public static MemorySegment SPLREG_PRINT_DRIVER_ISOLATION_EXECUTION_POLICY() {
        return constants$919.SPLREG_PRINT_DRIVER_ISOLATION_EXECUTION_POLICY$SEGMENT;
    }
    public static MemorySegment SPLREG_PRINT_DRIVER_ISOLATION_OVERRIDE_POLICY() {
        return constants$919.SPLREG_PRINT_DRIVER_ISOLATION_OVERRIDE_POLICY$SEGMENT;
    }
    public static MemorySegment SPLREG_PRINT_QUEUE_V4_DRIVER_DIRECTORY() {
        return constants$919.SPLREG_PRINT_QUEUE_V4_DRIVER_DIRECTORY$SEGMENT;
    }
    public static int SERVER_ALL_ACCESS() {
        return (int)983043L;
    }
    public static int SERVER_READ() {
        return (int)131074L;
    }
    public static int SERVER_WRITE() {
        return (int)131075L;
    }
    public static int SERVER_EXECUTE() {
        return (int)131074L;
    }
    public static int PRINTER_ALL_ACCESS() {
        return (int)983052L;
    }
    public static int PRINTER_READ() {
        return (int)131080L;
    }
    public static int PRINTER_WRITE() {
        return (int)131080L;
    }
    public static int PRINTER_EXECUTE() {
        return (int)131080L;
    }
    public static int JOB_ALL_ACCESS() {
        return (int)983088L;
    }
    public static int JOB_READ() {
        return (int)131104L;
    }
    public static int JOB_WRITE() {
        return (int)131088L;
    }
    public static int JOB_EXECUTE() {
        return (int)131088L;
    }
    public static MemorySegment SPLDS_SPOOLER_KEY() {
        return constants$919.SPLDS_SPOOLER_KEY$SEGMENT;
    }
    public static MemorySegment SPLDS_DRIVER_KEY() {
        return constants$920.SPLDS_DRIVER_KEY$SEGMENT;
    }
    public static MemorySegment SPLDS_USER_KEY() {
        return constants$920.SPLDS_USER_KEY$SEGMENT;
    }
    public static MemorySegment SPLDS_ASSET_NUMBER() {
        return constants$920.SPLDS_ASSET_NUMBER$SEGMENT;
    }
    public static MemorySegment SPLDS_BYTES_PER_MINUTE() {
        return constants$920.SPLDS_BYTES_PER_MINUTE$SEGMENT;
    }
    public static MemorySegment SPLDS_DESCRIPTION() {
        return constants$920.SPLDS_DESCRIPTION$SEGMENT;
    }
    public static MemorySegment SPLDS_DRIVER_NAME() {
        return constants$920.SPLDS_DRIVER_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_DRIVER_VERSION() {
        return constants$921.SPLDS_DRIVER_VERSION$SEGMENT;
    }
    public static MemorySegment SPLDS_LOCATION() {
        return constants$921.SPLDS_LOCATION$SEGMENT;
    }
    public static MemorySegment SPLDS_PORT_NAME() {
        return constants$921.SPLDS_PORT_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_ATTRIBUTES() {
        return constants$921.SPLDS_PRINT_ATTRIBUTES$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_BIN_NAMES() {
        return constants$921.SPLDS_PRINT_BIN_NAMES$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_COLLATE() {
        return constants$921.SPLDS_PRINT_COLLATE$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_COLOR() {
        return constants$922.SPLDS_PRINT_COLOR$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_DUPLEX_SUPPORTED() {
        return constants$922.SPLDS_PRINT_DUPLEX_SUPPORTED$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_END_TIME() {
        return constants$922.SPLDS_PRINT_END_TIME$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINTER_CLASS() {
        return constants$922.SPLDS_PRINTER_CLASS$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINTER_NAME() {
        return constants$922.SPLDS_PRINTER_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_KEEP_PRINTED_JOBS() {
        return constants$922.SPLDS_PRINT_KEEP_PRINTED_JOBS$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_LANGUAGE() {
        return constants$923.SPLDS_PRINT_LANGUAGE$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MAC_ADDRESS() {
        return constants$923.SPLDS_PRINT_MAC_ADDRESS$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MAX_X_EXTENT() {
        return constants$923.SPLDS_PRINT_MAX_X_EXTENT$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MAX_Y_EXTENT() {
        return constants$923.SPLDS_PRINT_MAX_Y_EXTENT$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MAX_RESOLUTION_SUPPORTED() {
        return constants$923.SPLDS_PRINT_MAX_RESOLUTION_SUPPORTED$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MEDIA_READY() {
        return constants$923.SPLDS_PRINT_MEDIA_READY$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MEDIA_SUPPORTED() {
        return constants$924.SPLDS_PRINT_MEDIA_SUPPORTED$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MEMORY() {
        return constants$924.SPLDS_PRINT_MEMORY$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MIN_X_EXTENT() {
        return constants$924.SPLDS_PRINT_MIN_X_EXTENT$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_MIN_Y_EXTENT() {
        return constants$924.SPLDS_PRINT_MIN_Y_EXTENT$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_NETWORK_ADDRESS() {
        return constants$924.SPLDS_PRINT_NETWORK_ADDRESS$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_NOTIFY() {
        return constants$924.SPLDS_PRINT_NOTIFY$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_NUMBER_UP() {
        return constants$925.SPLDS_PRINT_NUMBER_UP$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_ORIENTATIONS_SUPPORTED() {
        return constants$925.SPLDS_PRINT_ORIENTATIONS_SUPPORTED$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_OWNER() {
        return constants$925.SPLDS_PRINT_OWNER$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_PAGES_PER_MINUTE() {
        return constants$925.SPLDS_PRINT_PAGES_PER_MINUTE$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_RATE() {
        return constants$925.SPLDS_PRINT_RATE$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_RATE_UNIT() {
        return constants$925.SPLDS_PRINT_RATE_UNIT$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_SEPARATOR_FILE() {
        return constants$926.SPLDS_PRINT_SEPARATOR_FILE$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_SHARE_NAME() {
        return constants$926.SPLDS_PRINT_SHARE_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_SPOOLING() {
        return constants$926.SPLDS_PRINT_SPOOLING$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_STAPLING_SUPPORTED() {
        return constants$926.SPLDS_PRINT_STAPLING_SUPPORTED$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_START_TIME() {
        return constants$926.SPLDS_PRINT_START_TIME$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINT_STATUS() {
        return constants$926.SPLDS_PRINT_STATUS$SEGMENT;
    }
    public static MemorySegment SPLDS_PRIORITY() {
        return constants$927.SPLDS_PRIORITY$SEGMENT;
    }
    public static MemorySegment SPLDS_SERVER_NAME() {
        return constants$927.SPLDS_SERVER_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_SHORT_SERVER_NAME() {
        return constants$927.SPLDS_SHORT_SERVER_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_UNC_NAME() {
        return constants$927.SPLDS_UNC_NAME$SEGMENT;
    }
    public static MemorySegment SPLDS_URL() {
        return constants$927.SPLDS_URL$SEGMENT;
    }
    public static MemorySegment SPLDS_FLAGS() {
        return constants$927.SPLDS_FLAGS$SEGMENT;
    }
    public static MemorySegment SPLDS_VERSION_NUMBER() {
        return constants$928.SPLDS_VERSION_NUMBER$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINTER_NAME_ALIASES() {
        return constants$928.SPLDS_PRINTER_NAME_ALIASES$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINTER_LOCATIONS() {
        return constants$928.SPLDS_PRINTER_LOCATIONS$SEGMENT;
    }
    public static MemorySegment SPLDS_PRINTER_MODEL() {
        return constants$928.SPLDS_PRINTER_MODEL$SEGMENT;
    }
    public static MemorySegment MS_PRINT_JOB_OUTPUT_FILE() {
        return constants$928.MS_PRINT_JOB_OUTPUT_FILE$SEGMENT;
    }
    public static int CLSCTX_INPROC() {
        return (int)3L;
    }
    public static int CLSCTX_ALL() {
        return (int)23L;
    }
    public static int CLSCTX_SERVER() {
        return (int)21L;
    }
    public static int STGM_DIRECT() {
        return (int)0L;
    }
    public static int STGM_TRANSACTED() {
        return (int)65536L;
    }
    public static int STGM_SIMPLE() {
        return (int)134217728L;
    }
    public static int STGM_READ() {
        return (int)0L;
    }
    public static int STGM_WRITE() {
        return (int)1L;
    }
    public static int STGM_READWRITE() {
        return (int)2L;
    }
    public static int STGM_SHARE_DENY_NONE() {
        return (int)64L;
    }
    public static int STGM_SHARE_DENY_READ() {
        return (int)48L;
    }
    public static int STGM_SHARE_DENY_WRITE() {
        return (int)32L;
    }
    public static int STGM_SHARE_EXCLUSIVE() {
        return (int)16L;
    }
    public static int STGM_PRIORITY() {
        return (int)262144L;
    }
    public static int STGM_DELETEONRELEASE() {
        return (int)67108864L;
    }
    public static int STGM_NOSCRATCH() {
        return (int)1048576L;
    }
    public static int STGM_CREATE() {
        return (int)4096L;
    }
    public static int STGM_CONVERT() {
        return (int)131072L;
    }
    public static int STGM_FAILIFTHERE() {
        return (int)0L;
    }
    public static int STGM_NOSNAPSHOT() {
        return (int)2097152L;
    }
    public static int STGM_DIRECT_SWMR() {
        return (int)4194304L;
    }
    public static MemorySegment SERVICES_ACTIVE_DATABASEW() {
        return constants$928.SERVICES_ACTIVE_DATABASEW$SEGMENT;
    }
    public static MemorySegment SERVICES_FAILED_DATABASEW() {
        return constants$929.SERVICES_FAILED_DATABASEW$SEGMENT;
    }
    public static MemorySegment SERVICES_ACTIVE_DATABASEA() {
        return constants$929.SERVICES_ACTIVE_DATABASEA$SEGMENT;
    }
    public static MemorySegment SERVICES_FAILED_DATABASEA() {
        return constants$929.SERVICES_FAILED_DATABASEA$SEGMENT;
    }
    public static short SC_GROUP_IDENTIFIERW() {
        return (short)43L;
    }
    public static int SC_GROUP_IDENTIFIERA() {
        return (int)43L;
    }
    public static MemorySegment SERVICES_ACTIVE_DATABASE() {
        return constants$929.SERVICES_ACTIVE_DATABASE$SEGMENT;
    }
    public static MemorySegment SERVICES_FAILED_DATABASE() {
        return constants$929.SERVICES_FAILED_DATABASE$SEGMENT;
    }
    public static int SC_GROUP_IDENTIFIER() {
        return (int)43L;
    }
    public static int SERVICE_NO_CHANGE() {
        return (int)4294967295L;
    }
    public static int SERVICE_STATE_ALL() {
        return (int)3L;
    }
    public static int SC_MANAGER_ALL_ACCESS() {
        return (int)983103L;
    }
    public static int SERVICE_ALL_ACCESS() {
        return (int)983551L;
    }
    public static int SERVICE_NOTIFY_STATUS_CHANGE() {
        return (int)2L;
    }
    public static int SERVICE_STOP_REASON_FLAG_MAX() {
        return (int)2147483648L;
    }
    public static int SERVICE_SID_TYPE_RESTRICTED() {
        return (int)3L;
    }
    public static MemorySegment SERVICE_TRIGGER_STARTED_ARGUMENT() {
        return constants$929.SERVICE_TRIGGER_STARTED_ARGUMENT$SEGMENT;
    }
    public static MemorySegment SC_AGGREGATE_STORAGE_KEY() {
        return constants$930.SC_AGGREGATE_STORAGE_KEY$SEGMENT;
    }
}

