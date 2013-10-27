class CreatePosts < ActiveRecord::Migration
  def change
    create_table :posts do |t|
      t.string :feeling
      t.text :comment

      t.timestamps
    end
  end
end
