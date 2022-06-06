package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // If you change the data structure to store the urls,
    // you only need to change this class only
    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var url = urls.get(lastIndex);
        urls.remove(url);

        return url;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator {

        private final BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
