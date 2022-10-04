// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class USN_JOURNAL_DATA_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("UsnJournalID"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("FirstUsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NextUsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LowestValidUsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxUsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaximumSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AllocationDelta"),
        Constants$root.C_SHORT$LAYOUT.withName("MinSupportedMajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MaxSupportedMajorVersion"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return USN_JOURNAL_DATA_V1.$struct$LAYOUT;
    }
    static final VarHandle UsnJournalID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UsnJournalID"));
    public static VarHandle UsnJournalID$VH() {
        return USN_JOURNAL_DATA_V1.UsnJournalID$VH;
    }
    public static long UsnJournalID$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.UsnJournalID$VH.get(seg);
    }
    public static void UsnJournalID$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.UsnJournalID$VH.set(seg, x);
    }
    public static long UsnJournalID$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.UsnJournalID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnJournalID$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.UsnJournalID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstUsn"));
    public static VarHandle FirstUsn$VH() {
        return USN_JOURNAL_DATA_V1.FirstUsn$VH;
    }
    public static long FirstUsn$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.FirstUsn$VH.get(seg);
    }
    public static void FirstUsn$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.FirstUsn$VH.set(seg, x);
    }
    public static long FirstUsn$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.FirstUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstUsn$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.FirstUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NextUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextUsn"));
    public static VarHandle NextUsn$VH() {
        return USN_JOURNAL_DATA_V1.NextUsn$VH;
    }
    public static long NextUsn$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.NextUsn$VH.get(seg);
    }
    public static void NextUsn$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.NextUsn$VH.set(seg, x);
    }
    public static long NextUsn$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.NextUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextUsn$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.NextUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LowestValidUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowestValidUsn"));
    public static VarHandle LowestValidUsn$VH() {
        return USN_JOURNAL_DATA_V1.LowestValidUsn$VH;
    }
    public static long LowestValidUsn$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.LowestValidUsn$VH.get(seg);
    }
    public static void LowestValidUsn$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.LowestValidUsn$VH.set(seg, x);
    }
    public static long LowestValidUsn$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.LowestValidUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowestValidUsn$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.LowestValidUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxUsn"));
    public static VarHandle MaxUsn$VH() {
        return USN_JOURNAL_DATA_V1.MaxUsn$VH;
    }
    public static long MaxUsn$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.MaxUsn$VH.get(seg);
    }
    public static void MaxUsn$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.MaxUsn$VH.set(seg, x);
    }
    public static long MaxUsn$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.MaxUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUsn$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.MaxUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaximumSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumSize"));
    public static VarHandle MaximumSize$VH() {
        return USN_JOURNAL_DATA_V1.MaximumSize$VH;
    }
    public static long MaximumSize$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.MaximumSize$VH.get(seg);
    }
    public static void MaximumSize$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.MaximumSize$VH.set(seg, x);
    }
    public static long MaximumSize$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.MaximumSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumSize$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.MaximumSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationDelta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationDelta"));
    public static VarHandle AllocationDelta$VH() {
        return USN_JOURNAL_DATA_V1.AllocationDelta$VH;
    }
    public static long AllocationDelta$get(MemorySegment seg) {
        return (long)USN_JOURNAL_DATA_V1.AllocationDelta$VH.get(seg);
    }
    public static void AllocationDelta$set( MemorySegment seg, long x) {
        USN_JOURNAL_DATA_V1.AllocationDelta$VH.set(seg, x);
    }
    public static long AllocationDelta$get(MemorySegment seg, long index) {
        return (long)USN_JOURNAL_DATA_V1.AllocationDelta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationDelta$set(MemorySegment seg, long index, long x) {
        USN_JOURNAL_DATA_V1.AllocationDelta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinSupportedMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinSupportedMajorVersion"));
    public static VarHandle MinSupportedMajorVersion$VH() {
        return USN_JOURNAL_DATA_V1.MinSupportedMajorVersion$VH;
    }
    public static short MinSupportedMajorVersion$get(MemorySegment seg) {
        return (short)USN_JOURNAL_DATA_V1.MinSupportedMajorVersion$VH.get(seg);
    }
    public static void MinSupportedMajorVersion$set( MemorySegment seg, short x) {
        USN_JOURNAL_DATA_V1.MinSupportedMajorVersion$VH.set(seg, x);
    }
    public static short MinSupportedMajorVersion$get(MemorySegment seg, long index) {
        return (short)USN_JOURNAL_DATA_V1.MinSupportedMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinSupportedMajorVersion$set(MemorySegment seg, long index, short x) {
        USN_JOURNAL_DATA_V1.MinSupportedMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxSupportedMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxSupportedMajorVersion"));
    public static VarHandle MaxSupportedMajorVersion$VH() {
        return USN_JOURNAL_DATA_V1.MaxSupportedMajorVersion$VH;
    }
    public static short MaxSupportedMajorVersion$get(MemorySegment seg) {
        return (short)USN_JOURNAL_DATA_V1.MaxSupportedMajorVersion$VH.get(seg);
    }
    public static void MaxSupportedMajorVersion$set( MemorySegment seg, short x) {
        USN_JOURNAL_DATA_V1.MaxSupportedMajorVersion$VH.set(seg, x);
    }
    public static short MaxSupportedMajorVersion$get(MemorySegment seg, long index) {
        return (short)USN_JOURNAL_DATA_V1.MaxSupportedMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxSupportedMajorVersion$set(MemorySegment seg, long index, short x) {
        USN_JOURNAL_DATA_V1.MaxSupportedMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


