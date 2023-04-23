import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listofcars.R;

import java.util.List;

public class CarAdapter<car> extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private final LayoutInflater inflater;

    private final List<Car> cars;

    public CarAdapter(Context context, List<Car> cars) {
        this.inflater = LayoutInflater.from(context);
        this.cars = cars;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = inflater.inflate(R.layout.list_item, parent, false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.img_car.setImageResource(car.getCarResource());
        holder.tv_name.setText(car.getName());
        holder.tv_desc.setText(car.getCarDescription());
        holder.tv_speed.setText(car.getTopSpeed());
    }

    @Override
    public int getItemCount() {

        return cars.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView img_car;
        final TextView tv_name, tv_speed, tv_desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img_car = itemView.findViewById(R.id.img_car);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_speed = itemView.findViewById(R.id.tv_speed);
            tv_desc = itemView.findViewById(R.id.tv_desc);

        }
    }

}
