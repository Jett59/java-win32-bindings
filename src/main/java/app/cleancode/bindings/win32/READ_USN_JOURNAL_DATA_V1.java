// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class READ_USN_JOURNAL_DATA_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartUsn"),
        Constants$root.C_LONG$LAYOUT.withName("ReasonMask"),
        Constants$root.C_LONG$LAYOUT.withName("ReturnOnlyOnClose"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Timeout"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("BytesToWaitFor"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("UsnJournalID"),
        Constants$root.C_SHORT$LAYOUT.withName("MinMajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MaxMajorVersion"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return READ_USN_JOURNAL_DATA_V1.$struct$LAYOUT;
    }
    static final VarHandle StartUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartUsn"));
    public static VarHandle StartUsn$VH() {
        return READ_USN_JOURNAL_DATA_V1.StartUsn$VH;
    }
    public static long StartUsn$get(MemorySegment seg) {
        return (long)READ_USN_JOURNAL_DATA_V1.StartUsn$VH.get(seg);
    }
    public static void StartUsn$set( MemorySegment seg, long x) {
        READ_USN_JOURNAL_DATA_V1.StartUsn$VH.set(seg, x);
    }
    public static long StartUsn$get(MemorySegment seg, long index) {
        return (long)READ_USN_JOURNAL_DATA_V1.StartUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartUsn$set(MemorySegment seg, long index, long x) {
        READ_USN_JOURNAL_DATA_V1.StartUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReasonMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReasonMask"));
    public static VarHandle ReasonMask$VH() {
        return READ_USN_JOURNAL_DATA_V1.ReasonMask$VH;
    }
    public static int ReasonMask$get(MemorySegment seg) {
        return (int)READ_USN_JOURNAL_DATA_V1.ReasonMask$VH.get(seg);
    }
    public static void ReasonMask$set( MemorySegment seg, int x) {
        READ_USN_JOURNAL_DATA_V1.ReasonMask$VH.set(seg, x);
    }
    public static int ReasonMask$get(MemorySegment seg, long index) {
        return (int)READ_USN_JOURNAL_DATA_V1.ReasonMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReasonMask$set(MemorySegment seg, long index, int x) {
        READ_USN_JOURNAL_DATA_V1.ReasonMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReturnOnlyOnClose$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReturnOnlyOnClose"));
    public static VarHandle ReturnOnlyOnClose$VH() {
        return READ_USN_JOURNAL_DATA_V1.ReturnOnlyOnClose$VH;
    }
    public static int ReturnOnlyOnClose$get(MemorySegment seg) {
        return (int)READ_USN_JOURNAL_DATA_V1.ReturnOnlyOnClose$VH.get(seg);
    }
    public static void ReturnOnlyOnClose$set( MemorySegment seg, int x) {
        READ_USN_JOURNAL_DATA_V1.ReturnOnlyOnClose$VH.set(seg, x);
    }
    public static int ReturnOnlyOnClose$get(MemorySegment seg, long index) {
        return (int)READ_USN_JOURNAL_DATA_V1.ReturnOnlyOnClose$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReturnOnlyOnClose$set(MemorySegment seg, long index, int x) {
        READ_USN_JOURNAL_DATA_V1.ReturnOnlyOnClose$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Timeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Timeout"));
    public static VarHandle Timeout$VH() {
        return READ_USN_JOURNAL_DATA_V1.Timeout$VH;
    }
    public static long Timeout$get(MemorySegment seg) {
        return (long)READ_USN_JOURNAL_DATA_V1.Timeout$VH.get(seg);
    }
    public static void Timeout$set( MemorySegment seg, long x) {
        READ_USN_JOURNAL_DATA_V1.Timeout$VH.set(seg, x);
    }
    public static long Timeout$get(MemorySegment seg, long index) {
        return (long)READ_USN_JOURNAL_DATA_V1.Timeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Timeout$set(MemorySegment seg, long index, long x) {
        READ_USN_JOURNAL_DATA_V1.Timeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BytesToWaitFor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesToWaitFor"));
    public static VarHandle BytesToWaitFor$VH() {
        return READ_USN_JOURNAL_DATA_V1.BytesToWaitFor$VH;
    }
    public static long BytesToWaitFor$get(MemorySegment seg) {
        return (long)READ_USN_JOURNAL_DATA_V1.BytesToWaitFor$VH.get(seg);
    }
    public static void BytesToWaitFor$set( MemorySegment seg, long x) {
        READ_USN_JOURNAL_DATA_V1.BytesToWaitFor$VH.set(seg, x);
    }
    public static long BytesToWaitFor$get(MemorySegment seg, long index) {
        return (long)READ_USN_JOURNAL_DATA_V1.BytesToWaitFor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesToWaitFor$set(MemorySegment seg, long index, long x) {
        READ_USN_JOURNAL_DATA_V1.BytesToWaitFor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UsnJournalID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UsnJournalID"));
    public static VarHandle UsnJournalID$VH() {
        return READ_USN_JOURNAL_DATA_V1.UsnJournalID$VH;
    }
    public static long UsnJournalID$get(MemorySegment seg) {
        return (long)READ_USN_JOURNAL_DATA_V1.UsnJournalID$VH.get(seg);
    }
    public static void UsnJournalID$set( MemorySegment seg, long x) {
        READ_USN_JOURNAL_DATA_V1.UsnJournalID$VH.set(seg, x);
    }
    public static long UsnJournalID$get(MemorySegment seg, long index) {
        return (long)READ_USN_JOURNAL_DATA_V1.UsnJournalID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnJournalID$set(MemorySegment seg, long index, long x) {
        READ_USN_JOURNAL_DATA_V1.UsnJournalID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinMajorVersion"));
    public static VarHandle MinMajorVersion$VH() {
        return READ_USN_JOURNAL_DATA_V1.MinMajorVersion$VH;
    }
    public static short MinMajorVersion$get(MemorySegment seg) {
        return (short)READ_USN_JOURNAL_DATA_V1.MinMajorVersion$VH.get(seg);
    }
    public static void MinMajorVersion$set( MemorySegment seg, short x) {
        READ_USN_JOURNAL_DATA_V1.MinMajorVersion$VH.set(seg, x);
    }
    public static short MinMajorVersion$get(MemorySegment seg, long index) {
        return (short)READ_USN_JOURNAL_DATA_V1.MinMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinMajorVersion$set(MemorySegment seg, long index, short x) {
        READ_USN_JOURNAL_DATA_V1.MinMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxMajorVersion"));
    public static VarHandle MaxMajorVersion$VH() {
        return READ_USN_JOURNAL_DATA_V1.MaxMajorVersion$VH;
    }
    public static short MaxMajorVersion$get(MemorySegment seg) {
        return (short)READ_USN_JOURNAL_DATA_V1.MaxMajorVersion$VH.get(seg);
    }
    public static void MaxMajorVersion$set( MemorySegment seg, short x) {
        READ_USN_JOURNAL_DATA_V1.MaxMajorVersion$VH.set(seg, x);
    }
    public static short MaxMajorVersion$get(MemorySegment seg, long index) {
        return (short)READ_USN_JOURNAL_DATA_V1.MaxMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxMajorVersion$set(MemorySegment seg, long index, short x) {
        READ_USN_JOURNAL_DATA_V1.MaxMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


